/**
 */
package sQL2AMN.amn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequential Subtitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.amn.SequentialSubtitution#getFirst <em>First</em>}</li>
 *   <li>{@link sQL2AMN.amn.SequentialSubtitution#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.amn.AmnPackage#getSequentialSubtitution()
 * @model
 * @generated
 */
public interface SequentialSubtitution extends Substitution {
	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(Substitution)
	 * @see sQL2AMN.amn.AmnPackage#getSequentialSubtitution_First()
	 * @model
	 * @generated
	 */
	Substitution getFirst();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.SequentialSubtitution#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(Substitution value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' reference.
	 * @see #setSecond(Substitution)
	 * @see sQL2AMN.amn.AmnPackage#getSequentialSubtitution_Second()
	 * @model
	 * @generated
	 */
	Substitution getSecond();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.SequentialSubtitution#getSecond <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(Substitution value);

} // SequentialSubtitution
