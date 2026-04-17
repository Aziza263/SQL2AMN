/**
 */
package sQL2AMN.sql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.sql.ForLoopStatement#getLoopVar <em>Loop Var</em>}</li>
 *   <li>{@link sQL2AMN.sql.ForLoopStatement#getFromTable <em>From Table</em>}</li>
 *   <li>{@link sQL2AMN.sql.ForLoopStatement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.sql.SqlPackage#getForLoopStatement()
 * @model
 * @generated
 */
public interface ForLoopStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Loop Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Var</em>' attribute.
	 * @see #setLoopVar(String)
	 * @see sQL2AMN.sql.SqlPackage#getForLoopStatement_LoopVar()
	 * @model
	 * @generated
	 */
	String getLoopVar();

	/**
	 * Sets the value of the '{@link sQL2AMN.sql.ForLoopStatement#getLoopVar <em>Loop Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Var</em>' attribute.
	 * @see #getLoopVar()
	 * @generated
	 */
	void setLoopVar(String value);

	/**
	 * Returns the value of the '<em><b>From Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Table</em>' attribute.
	 * @see #setFromTable(String)
	 * @see sQL2AMN.sql.SqlPackage#getForLoopStatement_FromTable()
	 * @model
	 * @generated
	 */
	String getFromTable();

	/**
	 * Sets the value of the '{@link sQL2AMN.sql.ForLoopStatement#getFromTable <em>From Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Table</em>' attribute.
	 * @see #getFromTable()
	 * @generated
	 */
	void setFromTable(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link sQL2AMN.sql.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see sQL2AMN.sql.SqlPackage#getForLoopStatement_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getBody();

} // ForLoopStatement
