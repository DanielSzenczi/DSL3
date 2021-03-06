/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.MathExp#getProgName <em>Prog Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.MathExp#getExt <em>Ext</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.MathExp#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getMathExp()
 * @model
 * @generated
 */
public interface MathExp extends EObject
{
  /**
   * Returns the value of the '<em><b>Prog Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prog Name</em>' attribute.
   * @see #setProgName(String)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getMathExp_ProgName()
   * @model
   * @generated
   */
  String getProgName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.MathExp#getProgName <em>Prog Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prog Name</em>' attribute.
   * @see #getProgName()
   * @generated
   */
  void setProgName(String value);

  /**
   * Returns the value of the '<em><b>Ext</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.math.Ext}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ext</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getMathExp_Ext()
   * @model containment="true"
   * @generated
   */
  EList<Ext> getExt();

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.math.VarBinding}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getMathExp_Variables()
   * @model containment="true"
   * @generated
   */
  EList<VarBinding> getVariables();

} // MathExp
