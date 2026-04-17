/**
 */
package sQL2AMN.amn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Subtitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.amn.SelectSubtitution#getCondition <em>Condition</em>}</li>
 *   <li>{@link sQL2AMN.amn.SelectSubtitution#getThenBody <em>Then Body</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.amn.AmnPackage#getSelectSubtitution()
 * @model
 * @generated
 */
public interface SelectSubtitution extends Substitution {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Expression)
	 * @see sQL2AMN.amn.AmnPackage#getSelectSubtitution_Condition()
	 * @model
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.SelectSubtitution#getCondition <em>Condition</em>}' reference.
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
	 * @see sQL2AMN.amn.AmnPackage#getSelectSubtitution_ThenBody()
	 * @model
	 * @generated
	 */
	Substitution getThenBody();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.SelectSubtitution#getThenBody <em>Then Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Body</em>' reference.
	 * @see #getThenBody()
	 * @generated
	 */
	void setThenBody(Substitution value);

} // SelectSubtitution
