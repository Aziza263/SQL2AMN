/**
 */
package sQL2AMN.sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.sql.SQLProgram#getProcedures <em>Procedures</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.sql.SqlPackage#getSQLProgram()
 * @model
 * @generated
 */
public interface SQLProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
	 * The list contents are of type {@link sQL2AMN.sql.Procedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedures</em>' containment reference list.
	 * @see sQL2AMN.sql.SqlPackage#getSQLProgram_Procedures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Procedure> getProcedures();

} // SQLProgram
