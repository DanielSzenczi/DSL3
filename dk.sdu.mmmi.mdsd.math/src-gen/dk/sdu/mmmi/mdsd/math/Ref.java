/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.Ref#getRef <em>Ref</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.Ref#getInt <em>Int</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getRef()
 * @model
 * @generated
 */
public interface Ref extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Binding)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getRef_Ref()
   * @model
   * @generated
   */
  Binding getRef();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.Ref#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Binding value);

  /**
   * Returns the value of the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' attribute.
   * @see #setInt(int)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getRef_Int()
   * @model
   * @generated
   */
  int getInt();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.Ref#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int</em>' attribute.
   * @see #getInt()
   * @generated
   */
  void setInt(int value);

} // Ref