package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.math.Div
import dk.sdu.mmmi.mdsd.math.LetBinding
import dk.sdu.mmmi.mdsd.math.MathExp
import dk.sdu.mmmi.mdsd.math.MathNumber
import dk.sdu.mmmi.mdsd.math.Minus
import dk.sdu.mmmi.mdsd.math.Mult
import dk.sdu.mmmi.mdsd.math.Plus
import dk.sdu.mmmi.mdsd.math.VarBinding
import dk.sdu.mmmi.mdsd.math.VariableUse
import java.util.HashMap
import java.util.Map
import javax.swing.JOptionPane
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mmmi.mdsd.math.Expression
import java.util.List
import java.util.ArrayList
import dk.sdu.mmmi.mdsd.math.MethodSignature
import dk.sdu.mmmi.mdsd.math.MethodName
import dk.sdu.mmmi.mdsd.math.Args
import dk.sdu.mmmi.mdsd.math.VarExt
import dk.sdu.mmmi.mdsd.math.MethodRefs
import dk.sdu.mmmi.mdsd.math.Ref
import dk.sdu.mmmi.mdsd.math.Parantheses

class MathGenerator extends AbstractGenerator {
	
static String top = "//Generated by dasze18"	
static String pkgName = "math_expression"
static Boolean hasExternal = false
static Map<String, String> varMap;
static List<Object> list;
static String str = ""
override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	val x = resource.allContents.filter(MathExp).next
	
	varMap = new HashMap()
	list = new ArrayList()
	
	if(x.ext !== null){
		this.hasExternal = true;
	}
	x.variables.forEach[generateMathFile(x,fsa)]
}
		
		
def generateMathFile( MathExp exp ,IFileSystemAccess2 fsa) {
	var name = exp.progName
    fsa.generateFile(pkgName+"/" +name+ ".java",generateMath(exp,name))
}

def generateMath(MathExp exp, String className)'''
«top»
package «pkgName»;

import java.util.*;

public class «className.toFirstUpper» {
	
//Attributes
«FOR m:exp.variables»
«m.generateAttribute(exp)»
«ENDFOR»

«IF !exp.ext.empty » 
private External external;
«ENDIF»

    
//Constructor
«exp.addConstructor(className.toFirstUpper)» 
	
	
//Compute
«exp.addCompute» 

«IF !exp.ext.empty »
//Interface
«exp.addInterface» 
«ENDIF»

}'''
    
/*
 
 * --------------
 * HELPER METHODS
 * --------------
 */
 
 
//Create Attributes
def dispatch generateAttribute(VarBinding binding, MathExp exp) '''
public int «binding.name»;'''
	
//Create Constructor
def static dispatch addConstructor(MathExp exp,String className)'''
«IF !exp.ext.empty »
public «className»(External external) { 
	this.external = external;
}
«ELSE»
public «className»() { 	
}
«ENDIF»
'''

//Create Compute method
def static dispatch addCompute(MathExp exp)'''
public void compute() {
    «FOR num:exp.variables»
     this.«num.name» = «num.ExpressionChunk»;
    «ENDFOR»
}
'''

//THE REST OF THE MATH SYMBOLS
def static dispatch String ExpressionChunk(VarBinding exp){
    exp.expression.ExpressionChunk.toString
}
def static dispatch String ExpressionChunk(VariableUse exp) {
  exp.ref.name.toString;
}


def static dispatch String ExpressionChunk(VarExt exp){
	if((exp.link as MethodRefs).ref !== null) { 
		var temp = "this.external." +exp.name + "("
		var count = 0
   		for(Ref arg:(exp.link as MethodRefs).ref){
   			if(count == 0){
   				System.out.println( "REF" +arg.ref.class)
   				temp = temp + arg.ref.name
   			}else{
   				temp = temp + "," + arg.ref.name
   			}
   			count +=1;
		 "this.external." +exp.name + "(" 
		}
   	  temp = temp + ")"
   }else{
   	"this.external." + exp.name + "()"
   }
}

def static dispatch String ExpressionChunk(Plus exp){
    exp.left.ExpressionChunk + " + " + exp.right.ExpressionChunk
}
def static dispatch String ExpressionChunk(Minus exp){
    exp.left.ExpressionChunk + " - " + exp.right.ExpressionChunk
}
def static dispatch ExpressionChunk(Mult exp){
    exp.left.ExpressionChunk + " * " + exp.right.ExpressionChunk
}
def static dispatch ExpressionChunk(Div exp){
    exp.left.ExpressionChunk + " / " + exp.right.ExpressionChunk
}
def static dispatch String ExpressionChunk(Parantheses exp){
 "(" + exp.p.ExpressionChunk + ")";
}
def static dispatch String ExpressionChunk(MathNumber exp){
    exp.value.toString
}
def static dispatch String ExpressionChunk(LetBinding exp){
  exp.binding.ExpressionChunk;
}
def static dispatch String ExpressionBinding(LetBinding binding){
  binding.body.ExpressionChunk;
}


//Create Interface
def static dispatch addInterface(MathExp exp)'''
interface External { 
    «FOR xt:exp.ext »
       «if(varMap.containsKey((xt.name as MethodName).name.toString) === false){
    	var str = "public int " + (xt.name as MethodName).name + "("
    	 if(((xt.name as MethodName).sig as Args).name.empty){
    	 	str = str + ");"
    	 }else{
    	 	var count = 0
    	 	for(String s :((xt.name as MethodName).sig as Args).name){
    	 		if(count === 0){
    	 			str = str + s + " arg"+ count 
    	 		}else{
    	 		
    	 			str = str + ","+ s + " arg"+ count  
    	 		}
    	 			count +=1;
    	 	}
    	 	str = str + ");" 
    	 }
    	list.add(str);
    	varMap.put((xt.name as MethodName).name.toString,"used")
    }»
    «ENDFOR»
    «FOR item:list »
    «item»
    «ENDFOR»
}'''
}

