/**
 */
package sQL2AMN.amn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Subtitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.amn.IfSubtitution#getCondition <em>Condition</em>}</li>
 *   <li>{@link sQL2AMN.amn.IfSubtitution#getThenBody <em>Then Body</em>}</li>
 *   <li>{@link sQL2AMN.amn.IfSubtitution#getElseBody <em>Else Body</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.amn.AmnPackage#getIfSubtitution()
 * @model
 * @generated
 */
public interface IfSubtitution extends Substitution {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Expression)
	 * @see sQL2AMN.amn.AmnPackage#getIfSubtitution_Condition()
	 * @model
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.IfSubtitution#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Then Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Body</em>' reference.
	 * @see #setThenBody(Substitution)
	 * @see sQL2AMN.amn.AmnPackage#getIfSubtitution_ThenBody()
	 * @model
	 * @generated
	 */
	Substitution getThenBody();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.IfSubtitution#getThenBody <em>Then Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Body</em>' reference.
	 * @see #getThenBody()
	 * @generated
	 */
	void setThenBody(Substitution value);

	/**
	 * Returns the value of the '<em><b>Else Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Body</em>' reference.
	 * @see #setElseBody(Substitution)
	 * @see sQL2AMN.amn.AmnPackage#getIfSubtitution_ElseBody()
	 * @model
	 * @generated
	 */
	Substitution getElseBody();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.IfSubtitution#getElseBody <em>Else Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Body</em>' reference.
	 * @see #getElseBody()
	 * @generated
	 */
	void setElseBody(Substitution value);

} // IfSubtitution
