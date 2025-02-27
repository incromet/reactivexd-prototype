/**
 * generated by Xtext 2.17.0
 */
package co.edu.escuelaing.reactivexd.reactiveXD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.escuelaing.reactivexd.reactiveXD.Trigger#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link co.edu.escuelaing.reactivexd.reactiveXD.Trigger#getReturndef <em>Returndef</em>}</li>
 *   <li>{@link co.edu.escuelaing.reactivexd.reactiveXD.Trigger#getEsig <em>Esig</em>}</li>
 *   <li>{@link co.edu.escuelaing.reactivexd.reactiveXD.Trigger#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see co.edu.escuelaing.reactivexd.reactiveXD.ReactiveXDPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EventPredicate
{
  /**
   * Returns the value of the '<em><b>Trigger Type</b></em>' attribute.
   * The literals are from the enumeration {@link co.edu.escuelaing.reactivexd.reactiveXD.TPrefix}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger Type</em>' attribute.
   * @see co.edu.escuelaing.reactivexd.reactiveXD.TPrefix
   * @see #setTriggerType(TPrefix)
   * @see co.edu.escuelaing.reactivexd.reactiveXD.ReactiveXDPackage#getTrigger_TriggerType()
   * @model
   * @generated
   */
  TPrefix getTriggerType();

  /**
   * Sets the value of the '{@link co.edu.escuelaing.reactivexd.reactiveXD.Trigger#getTriggerType <em>Trigger Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger Type</em>' attribute.
   * @see co.edu.escuelaing.reactivexd.reactiveXD.TPrefix
   * @see #getTriggerType()
   * @generated
   */
  void setTriggerType(TPrefix value);

  /**
   * Returns the value of the '<em><b>Returndef</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Returndef</em>' containment reference.
   * @see #setReturndef(JVMTYPE)
   * @see co.edu.escuelaing.reactivexd.reactiveXD.ReactiveXDPackage#getTrigger_Returndef()
   * @model containment="true"
   * @generated
   */
  JVMTYPE getReturndef();

  /**
   * Sets the value of the '{@link co.edu.escuelaing.reactivexd.reactiveXD.Trigger#getReturndef <em>Returndef</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Returndef</em>' containment reference.
   * @see #getReturndef()
   * @generated
   */
  void setReturndef(JVMTYPE value);

  /**
   * Returns the value of the '<em><b>Esig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Esig</em>' attribute.
   * @see #setEsig(String)
   * @see co.edu.escuelaing.reactivexd.reactiveXD.ReactiveXDPackage#getTrigger_Esig()
   * @model
   * @generated
   */
  String getEsig();

  /**
   * Sets the value of the '{@link co.edu.escuelaing.reactivexd.reactiveXD.Trigger#getEsig <em>Esig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Esig</em>' attribute.
   * @see #getEsig()
   * @generated
   */
  void setEsig(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmTypeReference}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see co.edu.escuelaing.reactivexd.reactiveXD.ReactiveXDPackage#getTrigger_Params()
   * @model containment="true"
   * @generated
   */
  EList<JvmTypeReference> getParams();

} // Trigger
