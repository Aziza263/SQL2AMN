/**
 */
package sQL2AMN.amn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AMN Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sQL2AMN.amn.AMNMachine#getName <em>Name</em>}</li>
 *   <li>{@link sQL2AMN.amn.AMNMachine#getVariables <em>Variables</em>}</li>
 *   <li>{@link sQL2AMN.amn.AMNMachine#getOperations <em>Operations</em>}</li>
 *   <li>{@link sQL2AMN.amn.AMNMachine#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link sQL2AMN.amn.AMNMachine#getSets <em>Sets</em>}</li>
 * </ul>
 *
 * @see sQL2AMN.amn.AmnPackage#getAMNMachine()
 * @model
 * @generated
 */
public interface AMNMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sQL2AMN.amn.AmnPackage#getAMNMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sQL2AMN.amn.AMNMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link sQL2AMN.amn.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see sQL2AMN.amn.AmnPackage#getAMNMachine_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link sQL2AMN.amn.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see sQL2AMN.amn.AmnPackage#getAMNMachine_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Invariants</b></em>' containment reference list.
	 * The list contents are of type {@link sQL2AMN.amn.InvariantPredicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariants</em>' containment reference list.
	 * @see sQL2AMN.amn.AmnPackage#getAMNMachine_Invariants()
	 * @model containment="true"
	 * @generated
	 */
	EList<InvariantPredicate> getInvariants();

	/**
	 * Returns the value of the '<em><b>Sets</b></em>' containment reference list.
	 * The list contents are of type {@link sQL2AMN.amn.SetDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets</em>' containment reference list.
	 * @see sQL2AMN.amn.AmnPackage#getAMNMachine_Sets()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetDefinition> getSets();

} // AMNMachine
