/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.MethodName#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.MethodName#getSig <em>Sig</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getMethodName()
 * @model
 * @generated
 */
public interface MethodName extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getMethodName_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.MethodName#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sig</em>' containment reference.
   * @see #setSig(MethodSignature)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getMethodName_Sig()
   * @model containment="true"
   * @generated
   */
  MethodSignature getSig();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.MethodName#getSig <em>Sig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sig</em>' containment reference.
   * @see #getSig()
   * @generated
   */
  void setSig(MethodSignature value);

} // MethodName
