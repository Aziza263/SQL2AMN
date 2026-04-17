/**
 */
package sQL2AMN.amn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sQL2AMN.amn.AmnPackage
 * @generated
 */
public interface AmnFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmnFactory eINSTANCE = sQL2AMN.amn.impl.AmnFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AMN Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AMN Machine</em>'.
	 * @generated
	 */
	AMNMachine createAMNMachine();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Ref</em>'.
	 * @generated
	 */
	VarRef createVarRef();

	/**
	 * Returns a new object of class '<em>Set Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Membership</em>'.
	 * @generated
	 */
	SetMembership createSetMembership();

	/**
	 * Returns a new object of class '<em>Conjuction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjuction</em>'.
	 * @generated
	 */
	Conjuction createConjuction();

	/**
	 * Returns a new object of class '<em>Invariant Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invariant Predicate</em>'.
	 * @generated
	 */
	InvariantPredicate createInvariantPredicate();

	/**
	 * Returns a new object of class '<em>Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Definition</em>'.
	 * @generated
	 */
	SetDefinition createSetDefinition();

	/**
	 * Returns a new object of class '<em>Assign Subtitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assign Subtitution</em>'.
	 * @generated
	 */
	AssignSubtitution createAssignSubtitution();

	/**
	 * Returns a new object of class '<em>Skip Subtitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skip Subtitution</em>'.
	 * @generated
	 */
	SkipSubtitution createSkipSubtitution();

	/**
	 * Returns a new object of class '<em>Any Subtitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Subtitution</em>'.
	 * @generated
	 */
	AnySubtitution createAnySubtitution();

	/**
	 * Returns a new object of class '<em>Select Subtitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Subtitution</em>'.
	 * @generated
	 */
	SelectSubtitution createSelectSubtitution();

	/**
	 * Returns a new object of class '<em>If Subtitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Subtitution</em>'.
	 * @generated
	 */
	IfSubtitution createIfSubtitution();

	/**
	 * Returns a new object of class '<em>Sequential Subtitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequential Subtitution</em>'.
	 * @generated
	 */
	SequentialSubtitution createSequentialSubtitution();

	/**
	 * Returns a new object of class '<em>Pre Subtitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Subtitution</em>'.
	 * @generated
	 */
	PreSubtitution createPreSubtitution();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AmnPackage getAmnPackage();

} //AmnFactory
