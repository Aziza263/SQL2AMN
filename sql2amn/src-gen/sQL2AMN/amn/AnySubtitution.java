/**
 */
package sQL2AMN.amn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Subtitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.amn.AnySubtitution#getBoundVar <em>Bound Var</em>}</li>
 *   <li>{@link sQL2AMN.amn.AnySubtitution#getCondition <em>Condition</em>}</li>
 *   <li>{@link sQL2AMN.amn.AnySubtitution#getThenBody <em>Then Body</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.amn.AmnPackage#getAnySubtitution()
 * @model
 * @generated
 */
public interface AnySubtitution extends Substitution {
	/**
	 * Returns the value of the '<em><b>Bound Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Var</em>' attribute.
	 * @see #setBoundVar(String)
	 * @see sQL2AMN.amn.AmnPackage#getAnySubtitution_BoundVar()
	 * @model
	 * @generated
	 */
	String getBoundVar();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.AnySubtitution#getBoundVar <em>Bound Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Var</em>' attribute.
	 * @see #getBoundVar()
	 * @generated
	 */
	void setBoundVar(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Expression)
	 * @see sQL2AMN.amn.AmnPackage#getAnySubtitution_Condition()
	 * @model
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.AnySubtitution#getCondition <em>Condition</em>}' reference.
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
	 * @see sQL2AMN.amn.AmnPackage#getAnySubtitution_ThenBody()
	 * @model
	 * @generated
	 */
	Substitution getThenBody();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.AnySubtitution#getThenBody <em>Then Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Body</em>' reference.
	 * @see #getThenBody()
	 * @generated
	 */
	void setThenBody(Substitution value);

} // AnySubtitution
