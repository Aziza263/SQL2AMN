/**
 */
package sQL2AMN.sql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.sql.IfStatement#getThenBranch <em>Then Branch</em>}</li>
 *   <li>{@link sQL2AMN.sql.IfStatement#getElseBranch <em>Else Branch</em>}</li>
 *   <li>{@link sQL2AMN.sql.IfStatement#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.sql.SqlPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Then Branch</b></em>' containment reference list.
	 * The list contents are of type {@link sQL2AMN.sql.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Branch</em>' containment reference list.
	 * @see sQL2AMN.sql.SqlPackage#getIfStatement_ThenBranch()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getThenBranch();

	/**
	 * Returns the value of the '<em><b>Else Branch</b></em>' containment reference list.
	 * The list contents are of type {@link sQL2AMN.sql.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Branch</em>' containment reference list.
	 * @see sQL2AMN.sql.SqlPackage#getIfStatement_ElseBranch()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getElseBranch();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see sQL2AMN.sql.SqlPackage#getIfStatement_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link sQL2AMN.sql.IfStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

} // IfStatement
