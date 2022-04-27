package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'var'", "'='", "'('", "')'", "','", "'external'", "'+'", "'-'", "'*'", "'/'", "'let'", "'in'", "'end'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:71:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'program' ( (lv_progName_1_0= RULE_ID ) ) ( (lv_ext_2_0= ruleExt ) )* ( (lv_variables_3_0= ruleVarBinding ) )* ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_progName_1_0=null;
        EObject lv_ext_2_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( (otherlv_0= 'program' ( (lv_progName_1_0= RULE_ID ) ) ( (lv_ext_2_0= ruleExt ) )* ( (lv_variables_3_0= ruleVarBinding ) )* ) )
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_progName_1_0= RULE_ID ) ) ( (lv_ext_2_0= ruleExt ) )* ( (lv_variables_3_0= ruleVarBinding ) )* )
            {
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_progName_1_0= RULE_ID ) ) ( (lv_ext_2_0= ruleExt ) )* ( (lv_variables_3_0= ruleVarBinding ) )* )
            // InternalMath.g:79:3: otherlv_0= 'program' ( (lv_progName_1_0= RULE_ID ) ) ( (lv_ext_2_0= ruleExt ) )* ( (lv_variables_3_0= ruleVarBinding ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getProgramKeyword_0());
            		
            // InternalMath.g:83:3: ( (lv_progName_1_0= RULE_ID ) )
            // InternalMath.g:84:4: (lv_progName_1_0= RULE_ID )
            {
            // InternalMath.g:84:4: (lv_progName_1_0= RULE_ID )
            // InternalMath.g:85:5: lv_progName_1_0= RULE_ID
            {
            lv_progName_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_progName_1_0, grammarAccess.getMathExpAccess().getProgNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMathExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"progName",
            						lv_progName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:101:3: ( (lv_ext_2_0= ruleExt ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:102:4: (lv_ext_2_0= ruleExt )
            	    {
            	    // InternalMath.g:102:4: (lv_ext_2_0= ruleExt )
            	    // InternalMath.g:103:5: lv_ext_2_0= ruleExt
            	    {

            	    					newCompositeNode(grammarAccess.getMathExpAccess().getExtExtParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_ext_2_0=ruleExt();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ext",
            	    						lv_ext_2_0,
            	    						"dk.sdu.mmmi.mdsd.Math.Ext");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMath.g:120:3: ( (lv_variables_3_0= ruleVarBinding ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:121:4: (lv_variables_3_0= ruleVarBinding )
            	    {
            	    // InternalMath.g:121:4: (lv_variables_3_0= ruleVarBinding )
            	    // InternalMath.g:122:5: lv_variables_3_0= ruleVarBinding
            	    {

            	    					newCompositeNode(grammarAccess.getMathExpAccess().getVariablesVarBindingParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_variables_3_0=ruleVarBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_3_0,
            	    						"dk.sdu.mmmi.mdsd.Math.VarBinding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleVarBinding"
    // InternalMath.g:143:1: entryRuleVarBinding returns [EObject current=null] : iv_ruleVarBinding= ruleVarBinding EOF ;
    public final EObject entryRuleVarBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarBinding = null;


        try {
            // InternalMath.g:143:51: (iv_ruleVarBinding= ruleVarBinding EOF )
            // InternalMath.g:144:2: iv_ruleVarBinding= ruleVarBinding EOF
            {
             newCompositeNode(grammarAccess.getVarBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarBinding=ruleVarBinding();

            state._fsp--;

             current =iv_ruleVarBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarBinding"


    // $ANTLR start "ruleVarBinding"
    // InternalMath.g:150:1: ruleVarBinding returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_expression_3_1= ruleExp | lv_expression_3_2= ruleVarExt ) ) ) ) ;
    public final EObject ruleVarBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_1 = null;

        EObject lv_expression_3_2 = null;



        	enterRule();

        try {
            // InternalMath.g:156:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_expression_3_1= ruleExp | lv_expression_3_2= ruleVarExt ) ) ) ) )
            // InternalMath.g:157:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_expression_3_1= ruleExp | lv_expression_3_2= ruleVarExt ) ) ) )
            {
            // InternalMath.g:157:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_expression_3_1= ruleExp | lv_expression_3_2= ruleVarExt ) ) ) )
            // InternalMath.g:158:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_expression_3_1= ruleExp | lv_expression_3_2= ruleVarExt ) ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarBindingAccess().getVarKeyword_0());
            		
            // InternalMath.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getVarBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:184:3: ( ( (lv_expression_3_1= ruleExp | lv_expression_3_2= ruleVarExt ) ) )
            // InternalMath.g:185:4: ( (lv_expression_3_1= ruleExp | lv_expression_3_2= ruleVarExt ) )
            {
            // InternalMath.g:185:4: ( (lv_expression_3_1= ruleExp | lv_expression_3_2= ruleVarExt ) )
            // InternalMath.g:186:5: (lv_expression_3_1= ruleExp | lv_expression_3_2= ruleVarExt )
            {
            // InternalMath.g:186:5: (lv_expression_3_1= ruleExp | lv_expression_3_2= ruleVarExt )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==14||LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==14) ) {
                    alt3=2;
                }
                else if ( (LA3_2==EOF||LA3_2==12||(LA3_2>=18 && LA3_2<=21)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:187:6: lv_expression_3_1= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getVarBindingAccess().getExpressionExpParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_3_1=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarBindingRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_3_1,
                    							"dk.sdu.mmmi.mdsd.Math.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMath.g:203:6: lv_expression_3_2= ruleVarExt
                    {

                    						newCompositeNode(grammarAccess.getVarBindingAccess().getExpressionVarExtParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_3_2=ruleVarExt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarBindingRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_3_2,
                    							"dk.sdu.mmmi.mdsd.Math.VarExt");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarBinding"


    // $ANTLR start "entryRuleVarExt"
    // InternalMath.g:225:1: entryRuleVarExt returns [EObject current=null] : iv_ruleVarExt= ruleVarExt EOF ;
    public final EObject entryRuleVarExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExt = null;


        try {
            // InternalMath.g:225:47: (iv_ruleVarExt= ruleVarExt EOF )
            // InternalMath.g:226:2: iv_ruleVarExt= ruleVarExt EOF
            {
             newCompositeNode(grammarAccess.getVarExtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarExt=ruleVarExt();

            state._fsp--;

             current =iv_ruleVarExt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarExt"


    // $ANTLR start "ruleVarExt"
    // InternalMath.g:232:1: ruleVarExt returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_link_1_0= ruleLink ) ) ) ;
    public final EObject ruleVarExt() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_link_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:238:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_link_1_0= ruleLink ) ) ) )
            // InternalMath.g:239:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_link_1_0= ruleLink ) ) )
            {
            // InternalMath.g:239:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_link_1_0= ruleLink ) ) )
            // InternalMath.g:240:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_link_1_0= ruleLink ) )
            {
            // InternalMath.g:240:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMath.g:241:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMath.g:241:4: (lv_name_0_0= RULE_ID )
            // InternalMath.g:242:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVarExtAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarExtRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:258:3: ( (lv_link_1_0= ruleLink ) )
            // InternalMath.g:259:4: (lv_link_1_0= ruleLink )
            {
            // InternalMath.g:259:4: (lv_link_1_0= ruleLink )
            // InternalMath.g:260:5: lv_link_1_0= ruleLink
            {

            					newCompositeNode(grammarAccess.getVarExtAccess().getLinkLinkParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_link_1_0=ruleLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarExtRule());
            					}
            					set(
            						current,
            						"link",
            						lv_link_1_0,
            						"dk.sdu.mmmi.mdsd.Math.Link");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarExt"


    // $ANTLR start "entryRuleLink"
    // InternalMath.g:281:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMath.g:281:45: (iv_ruleLink= ruleLink EOF )
            // InternalMath.g:282:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalMath.g:288:1: ruleLink returns [EObject current=null] : (otherlv_0= '(' this_MethodRefs_1= ruleMethodRefs otherlv_2= ')' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_MethodRefs_1 = null;



        	enterRule();

        try {
            // InternalMath.g:294:2: ( (otherlv_0= '(' this_MethodRefs_1= ruleMethodRefs otherlv_2= ')' ) )
            // InternalMath.g:295:2: (otherlv_0= '(' this_MethodRefs_1= ruleMethodRefs otherlv_2= ')' )
            {
            // InternalMath.g:295:2: (otherlv_0= '(' this_MethodRefs_1= ruleMethodRefs otherlv_2= ')' )
            // InternalMath.g:296:3: otherlv_0= '(' this_MethodRefs_1= ruleMethodRefs otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLinkAccess().getMethodRefsParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            this_MethodRefs_1=ruleMethodRefs();

            state._fsp--;


            			current = this_MethodRefs_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleMethodRefs"
    // InternalMath.g:316:1: entryRuleMethodRefs returns [EObject current=null] : iv_ruleMethodRefs= ruleMethodRefs EOF ;
    public final EObject entryRuleMethodRefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodRefs = null;


        try {
            // InternalMath.g:316:51: (iv_ruleMethodRefs= ruleMethodRefs EOF )
            // InternalMath.g:317:2: iv_ruleMethodRefs= ruleMethodRefs EOF
            {
             newCompositeNode(grammarAccess.getMethodRefsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodRefs=ruleMethodRefs();

            state._fsp--;

             current =iv_ruleMethodRefs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodRefs"


    // $ANTLR start "ruleMethodRefs"
    // InternalMath.g:323:1: ruleMethodRefs returns [EObject current=null] : ( () ( ( (lv_ref_1_0= ruleRef ) ) (otherlv_2= ',' )? )* ) ;
    public final EObject ruleMethodRefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:329:2: ( ( () ( ( (lv_ref_1_0= ruleRef ) ) (otherlv_2= ',' )? )* ) )
            // InternalMath.g:330:2: ( () ( ( (lv_ref_1_0= ruleRef ) ) (otherlv_2= ',' )? )* )
            {
            // InternalMath.g:330:2: ( () ( ( (lv_ref_1_0= ruleRef ) ) (otherlv_2= ',' )? )* )
            // InternalMath.g:331:3: () ( ( (lv_ref_1_0= ruleRef ) ) (otherlv_2= ',' )? )*
            {
            // InternalMath.g:331:3: ()
            // InternalMath.g:332:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodRefsAccess().getMethodRefsAction_0(),
            					current);
            			

            }

            // InternalMath.g:338:3: ( ( (lv_ref_1_0= ruleRef ) ) (otherlv_2= ',' )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMath.g:339:4: ( (lv_ref_1_0= ruleRef ) ) (otherlv_2= ',' )?
            	    {
            	    // InternalMath.g:339:4: ( (lv_ref_1_0= ruleRef ) )
            	    // InternalMath.g:340:5: (lv_ref_1_0= ruleRef )
            	    {
            	    // InternalMath.g:340:5: (lv_ref_1_0= ruleRef )
            	    // InternalMath.g:341:6: lv_ref_1_0= ruleRef
            	    {

            	    						newCompositeNode(grammarAccess.getMethodRefsAccess().getRefRefParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_ref_1_0=ruleRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMethodRefsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ref",
            	    							lv_ref_1_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Ref");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMath.g:358:4: (otherlv_2= ',' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==16) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMath.g:359:5: otherlv_2= ','
            	            {
            	            otherlv_2=(Token)match(input,16,FOLLOW_12); 

            	            					newLeafNode(otherlv_2, grammarAccess.getMethodRefsAccess().getCommaKeyword_1_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodRefs"


    // $ANTLR start "entryRuleRef"
    // InternalMath.g:369:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // InternalMath.g:369:44: (iv_ruleRef= ruleRef EOF )
            // InternalMath.g:370:2: iv_ruleRef= ruleRef EOF
            {
             newCompositeNode(grammarAccess.getRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRef=ruleRef();

            state._fsp--;

             current =iv_ruleRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // InternalMath.g:376:1: ruleRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_int_1_0= RULE_INT ) ) ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_int_1_0=null;


        	enterRule();

        try {
            // InternalMath.g:382:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_int_1_0= RULE_INT ) ) ) )
            // InternalMath.g:383:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_int_1_0= RULE_INT ) ) )
            {
            // InternalMath.g:383:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_int_1_0= RULE_INT ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMath.g:384:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalMath.g:384:3: ( (otherlv_0= RULE_ID ) )
                    // InternalMath.g:385:4: (otherlv_0= RULE_ID )
                    {
                    // InternalMath.g:385:4: (otherlv_0= RULE_ID )
                    // InternalMath.g:386:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRefRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getRefAccess().getRefBindingCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:398:3: ( (lv_int_1_0= RULE_INT ) )
                    {
                    // InternalMath.g:398:3: ( (lv_int_1_0= RULE_INT ) )
                    // InternalMath.g:399:4: (lv_int_1_0= RULE_INT )
                    {
                    // InternalMath.g:399:4: (lv_int_1_0= RULE_INT )
                    // InternalMath.g:400:5: lv_int_1_0= RULE_INT
                    {
                    lv_int_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_int_1_0, grammarAccess.getRefAccess().getIntINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRefRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"int",
                    						lv_int_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleExt"
    // InternalMath.g:420:1: entryRuleExt returns [EObject current=null] : iv_ruleExt= ruleExt EOF ;
    public final EObject entryRuleExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExt = null;


        try {
            // InternalMath.g:420:44: (iv_ruleExt= ruleExt EOF )
            // InternalMath.g:421:2: iv_ruleExt= ruleExt EOF
            {
             newCompositeNode(grammarAccess.getExtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExt=ruleExt();

            state._fsp--;

             current =iv_ruleExt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExt"


    // $ANTLR start "ruleExt"
    // InternalMath.g:427:1: ruleExt returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= ruleMethodName ) )? ) ;
    public final EObject ruleExt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:433:2: ( (otherlv_0= 'external' ( (lv_name_1_0= ruleMethodName ) )? ) )
            // InternalMath.g:434:2: (otherlv_0= 'external' ( (lv_name_1_0= ruleMethodName ) )? )
            {
            // InternalMath.g:434:2: (otherlv_0= 'external' ( (lv_name_1_0= ruleMethodName ) )? )
            // InternalMath.g:435:3: otherlv_0= 'external' ( (lv_name_1_0= ruleMethodName ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getExtAccess().getExternalKeyword_0());
            		
            // InternalMath.g:439:3: ( (lv_name_1_0= ruleMethodName ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMath.g:440:4: (lv_name_1_0= ruleMethodName )
                    {
                    // InternalMath.g:440:4: (lv_name_1_0= ruleMethodName )
                    // InternalMath.g:441:5: lv_name_1_0= ruleMethodName
                    {

                    					newCompositeNode(grammarAccess.getExtAccess().getNameMethodNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_1_0=ruleMethodName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExtRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"dk.sdu.mmmi.mdsd.Math.MethodName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExt"


    // $ANTLR start "entryRuleMethodName"
    // InternalMath.g:462:1: entryRuleMethodName returns [EObject current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final EObject entryRuleMethodName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodName = null;


        try {
            // InternalMath.g:462:51: (iv_ruleMethodName= ruleMethodName EOF )
            // InternalMath.g:463:2: iv_ruleMethodName= ruleMethodName EOF
            {
             newCompositeNode(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodName=ruleMethodName();

            state._fsp--;

             current =iv_ruleMethodName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodName"


    // $ANTLR start "ruleMethodName"
    // InternalMath.g:469:1: ruleMethodName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_sig_1_0= ruleMethodSignature ) ) ) ;
    public final EObject ruleMethodName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_sig_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:475:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_sig_1_0= ruleMethodSignature ) ) ) )
            // InternalMath.g:476:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_sig_1_0= ruleMethodSignature ) ) )
            {
            // InternalMath.g:476:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_sig_1_0= ruleMethodSignature ) ) )
            // InternalMath.g:477:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_sig_1_0= ruleMethodSignature ) )
            {
            // InternalMath.g:477:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMath.g:478:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMath.g:478:4: (lv_name_0_0= RULE_ID )
            // InternalMath.g:479:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMethodNameAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:495:3: ( (lv_sig_1_0= ruleMethodSignature ) )
            // InternalMath.g:496:4: (lv_sig_1_0= ruleMethodSignature )
            {
            // InternalMath.g:496:4: (lv_sig_1_0= ruleMethodSignature )
            // InternalMath.g:497:5: lv_sig_1_0= ruleMethodSignature
            {

            					newCompositeNode(grammarAccess.getMethodNameAccess().getSigMethodSignatureParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_sig_1_0=ruleMethodSignature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodNameRule());
            					}
            					set(
            						current,
            						"sig",
            						lv_sig_1_0,
            						"dk.sdu.mmmi.mdsd.Math.MethodSignature");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodName"


    // $ANTLR start "entryRuleMethodSignature"
    // InternalMath.g:518:1: entryRuleMethodSignature returns [EObject current=null] : iv_ruleMethodSignature= ruleMethodSignature EOF ;
    public final EObject entryRuleMethodSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodSignature = null;


        try {
            // InternalMath.g:518:56: (iv_ruleMethodSignature= ruleMethodSignature EOF )
            // InternalMath.g:519:2: iv_ruleMethodSignature= ruleMethodSignature EOF
            {
             newCompositeNode(grammarAccess.getMethodSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodSignature=ruleMethodSignature();

            state._fsp--;

             current =iv_ruleMethodSignature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodSignature"


    // $ANTLR start "ruleMethodSignature"
    // InternalMath.g:525:1: ruleMethodSignature returns [EObject current=null] : (otherlv_0= '(' this_Args_1= ruleArgs otherlv_2= ')' ) ;
    public final EObject ruleMethodSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Args_1 = null;



        	enterRule();

        try {
            // InternalMath.g:531:2: ( (otherlv_0= '(' this_Args_1= ruleArgs otherlv_2= ')' ) )
            // InternalMath.g:532:2: (otherlv_0= '(' this_Args_1= ruleArgs otherlv_2= ')' )
            {
            // InternalMath.g:532:2: (otherlv_0= '(' this_Args_1= ruleArgs otherlv_2= ')' )
            // InternalMath.g:533:3: otherlv_0= '(' this_Args_1= ruleArgs otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodSignatureAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getMethodSignatureAccess().getArgsParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            this_Args_1=ruleArgs();

            state._fsp--;


            			current = this_Args_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodSignatureAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodSignature"


    // $ANTLR start "entryRuleArgs"
    // InternalMath.g:553:1: entryRuleArgs returns [EObject current=null] : iv_ruleArgs= ruleArgs EOF ;
    public final EObject entryRuleArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgs = null;


        try {
            // InternalMath.g:553:45: (iv_ruleArgs= ruleArgs EOF )
            // InternalMath.g:554:2: iv_ruleArgs= ruleArgs EOF
            {
             newCompositeNode(grammarAccess.getArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgs=ruleArgs();

            state._fsp--;

             current =iv_ruleArgs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgs"


    // $ANTLR start "ruleArgs"
    // InternalMath.g:560:1: ruleArgs returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )? )* ) ;
    public final EObject ruleArgs() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMath.g:566:2: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )? )* ) )
            // InternalMath.g:567:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )? )* )
            {
            // InternalMath.g:567:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )? )* )
            // InternalMath.g:568:3: () ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )? )*
            {
            // InternalMath.g:568:3: ()
            // InternalMath.g:569:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArgsAccess().getArgsAction_0(),
            					current);
            			

            }

            // InternalMath.g:575:3: ( ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )? )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMath.g:576:4: ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )?
            	    {
            	    // InternalMath.g:576:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalMath.g:577:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalMath.g:577:5: (lv_name_1_0= RULE_ID )
            	    // InternalMath.g:578:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getArgsAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getArgsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalMath.g:594:4: (otherlv_2= ',' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==16) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalMath.g:595:5: otherlv_2= ','
            	            {
            	            otherlv_2=(Token)match(input,16,FOLLOW_13); 

            	            					newLeafNode(otherlv_2, grammarAccess.getArgsAccess().getCommaKeyword_1_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgs"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:605:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:605:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:606:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:612:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:618:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMath.g:619:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMath.g:619:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMath.g:620:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:628:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=18 && LA11_0<=19)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMath.g:629:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMath.g:629:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==18) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==19) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalMath.g:630:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMath.g:630:5: ( () otherlv_2= '+' )
            	            // InternalMath.g:631:6: () otherlv_2= '+'
            	            {
            	            // InternalMath.g:631:6: ()
            	            // InternalMath.g:632:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,18,FOLLOW_7); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:644:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMath.g:644:5: ( () otherlv_4= '-' )
            	            // InternalMath.g:645:6: () otherlv_4= '-'
            	            {
            	            // InternalMath.g:645:6: ()
            	            // InternalMath.g:646:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,19,FOLLOW_7); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:658:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMath.g:659:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMath.g:659:5: (lv_right_5_0= ruleFactor )
            	    // InternalMath.g:660:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:682:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMath.g:682:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMath.g:683:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:689:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:695:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMath.g:696:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:696:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMath.g:697:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:705:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=20 && LA13_0<=21)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMath.g:706:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:706:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==20) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==21) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalMath.g:707:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMath.g:707:5: ( () otherlv_2= '*' )
            	            // InternalMath.g:708:6: () otherlv_2= '*'
            	            {
            	            // InternalMath.g:708:6: ()
            	            // InternalMath.g:709:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,20,FOLLOW_7); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:721:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMath.g:721:5: ( () otherlv_4= '/' )
            	            // InternalMath.g:722:6: () otherlv_4= '/'
            	            {
            	            // InternalMath.g:722:6: ()
            	            // InternalMath.g:723:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,21,FOLLOW_7); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:735:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMath.g:736:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMath.g:736:5: (lv_right_5_0= rulePrimary )
            	    // InternalMath.g:737:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:759:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:759:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:760:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:766:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_p_3_0= ruleParantheses ) ) ) | this_VariableUse_4= ruleVariableUse | this_LetBinding_5= ruleLetBinding ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject lv_p_3_0 = null;

        EObject this_VariableUse_4 = null;

        EObject this_LetBinding_5 = null;



        	enterRule();

        try {
            // InternalMath.g:772:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_p_3_0= ruleParantheses ) ) ) | this_VariableUse_4= ruleVariableUse | this_LetBinding_5= ruleLetBinding ) )
            // InternalMath.g:773:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_p_3_0= ruleParantheses ) ) ) | this_VariableUse_4= ruleVariableUse | this_LetBinding_5= ruleLetBinding )
            {
            // InternalMath.g:773:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_p_3_0= ruleParantheses ) ) ) | this_VariableUse_4= ruleVariableUse | this_LetBinding_5= ruleLetBinding )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt14=1;
                }
                break;
            case 14:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
                {
                alt14=3;
                }
                break;
            case 22:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMath.g:774:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMath.g:774:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMath.g:775:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMath.g:775:4: ()
                    // InternalMath.g:776:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMathNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:782:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMath.g:783:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMath.g:783:5: (lv_value_1_0= RULE_INT )
                    // InternalMath.g:784:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:802:3: ( () ( (lv_p_3_0= ruleParantheses ) ) )
                    {
                    // InternalMath.g:802:3: ( () ( (lv_p_3_0= ruleParantheses ) ) )
                    // InternalMath.g:803:4: () ( (lv_p_3_0= ruleParantheses ) )
                    {
                    // InternalMath.g:803:4: ()
                    // InternalMath.g:804:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getParanthesesAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:810:4: ( (lv_p_3_0= ruleParantheses ) )
                    // InternalMath.g:811:5: (lv_p_3_0= ruleParantheses )
                    {
                    // InternalMath.g:811:5: (lv_p_3_0= ruleParantheses )
                    // InternalMath.g:812:6: lv_p_3_0= ruleParantheses
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getPParanthesesParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_p_3_0=ruleParantheses();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"p",
                    							lv_p_3_0,
                    							"dk.sdu.mmmi.mdsd.Math.Parantheses");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:831:3: this_VariableUse_4= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_4=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:840:3: this_LetBinding_5= ruleLetBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetBinding_5=ruleLetBinding();

                    state._fsp--;


                    			current = this_LetBinding_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParantheses"
    // InternalMath.g:852:1: entryRuleParantheses returns [EObject current=null] : iv_ruleParantheses= ruleParantheses EOF ;
    public final EObject entryRuleParantheses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParantheses = null;


        try {
            // InternalMath.g:852:52: (iv_ruleParantheses= ruleParantheses EOF )
            // InternalMath.g:853:2: iv_ruleParantheses= ruleParantheses EOF
            {
             newCompositeNode(grammarAccess.getParanthesesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParantheses=ruleParantheses();

            state._fsp--;

             current =iv_ruleParantheses; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParantheses"


    // $ANTLR start "ruleParantheses"
    // InternalMath.g:859:1: ruleParantheses returns [EObject current=null] : (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) ;
    public final EObject ruleParantheses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;



        	enterRule();

        try {
            // InternalMath.g:865:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) )
            // InternalMath.g:866:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            {
            // InternalMath.g:866:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            // InternalMath.g:867:3: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getParanthesesAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParanthesesAccess().getExpParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            this_Exp_1=ruleExp();

            state._fsp--;


            			current = this_Exp_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParanthesesAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParantheses"


    // $ANTLR start "entryRuleLetBinding"
    // InternalMath.g:887:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalMath.g:887:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalMath.g:888:2: iv_ruleLetBinding= ruleLetBinding EOF
            {
             newCompositeNode(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetBinding=ruleLetBinding();

            state._fsp--;

             current =iv_ruleLetBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalMath.g:894:1: ruleLetBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_binding_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:900:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalMath.g:901:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalMath.g:901:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalMath.g:902:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetBindingAccess().getLetKeyword_0());
            		
            // InternalMath.g:906:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:907:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:907:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:908:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:928:3: ( (lv_binding_3_0= ruleExp ) )
            // InternalMath.g:929:4: (lv_binding_3_0= ruleExp )
            {
            // InternalMath.g:929:4: (lv_binding_3_0= ruleExp )
            // InternalMath.g:930:5: lv_binding_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_binding_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getLetBindingAccess().getInKeyword_4());
            		
            // InternalMath.g:951:3: ( (lv_body_5_0= ruleExp ) )
            // InternalMath.g:952:4: (lv_body_5_0= ruleExp )
            {
            // InternalMath.g:952:4: (lv_body_5_0= ruleExp )
            // InternalMath.g:953:5: lv_body_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_body_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetBindingAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:978:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:978:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:979:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:985:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMath.g:991:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMath.g:992:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMath.g:992:2: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:993:3: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:993:3: (otherlv_0= RULE_ID )
            // InternalMath.g:994:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefBindingCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000021002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000404030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});

}