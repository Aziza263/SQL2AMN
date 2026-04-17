/**
 */
package sQL2AMN.amn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjuction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.amn.Conjuction#getLeft <em>Left</em>}</li>
 *   <li>{@link sQL2AMN.amn.Conjuction#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.amn.AmnPackage#getConjuction()
 * @model
 * @generated
 */
public interface Conjuction extends Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Expression)
	 * @see sQL2AMN.amn.AmnPackage#getConjuction_Left()
	 * @model
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.Conjuction#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Expression)
	 * @see sQL2AMN.amn.AmnPackage#getConjuction_Right()
	 * @model
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.Conjuction#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // Conjuction
