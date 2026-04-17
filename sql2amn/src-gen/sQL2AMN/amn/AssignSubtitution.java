/**
 */
package sQL2AMN.amn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Subtitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.amn.AssignSubtitution#getVariable <em>Variable</em>}</li>
 *   <li>{@link sQL2AMN.amn.AssignSubtitution#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.amn.AmnPackage#getAssignSubtitution()
 * @model
 * @generated
 */
public interface AssignSubtitution extends Substitution {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see sQL2AMN.amn.AmnPackage#getAssignSubtitution_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.AssignSubtitution#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Expression)
	 * @see sQL2AMN.amn.AmnPackage#getAssignSubtitution_Value()
	 * @model
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.AssignSubtitution#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // AssignSubtitution
