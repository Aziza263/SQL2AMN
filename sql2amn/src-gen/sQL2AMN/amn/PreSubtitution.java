/**
 */
package sQL2AMN.amn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Subtitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.amn.PreSubtitution#getGuard <em>Guard</em>}</li>
 *   <li>{@link sQL2AMN.amn.PreSubtitution#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.amn.AmnPackage#getPreSubtitution()
 * @model
 * @generated
 */
public interface PreSubtitution extends Substitution {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(Expression)
	 * @see sQL2AMN.amn.AmnPackage#getPreSubtitution_Guard()
	 * @model
	 * @generated
	 */
	Expression getGuard();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.PreSubtitution#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Expression value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(Substitution)
	 * @see sQL2AMN.amn.AmnPackage#getPreSubtitution_Body()
	 * @model
	 * @generated
	 */
	Substitution getBody();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.PreSubtitution#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Substitution value);

} // PreSubtitution
