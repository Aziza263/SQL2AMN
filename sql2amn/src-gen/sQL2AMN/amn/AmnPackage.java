/**
 */
package sQL2AMN.amn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sQL2AMN.amn.AmnFactory
 * @model kind="package"
 * @generated
 */
public interface AmnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "amn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://amn/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "amn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmnPackage eINSTANCE = sQL2AMN.amn.impl.AmnPackageImpl.init();

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.AMNMachineImpl <em>AMN Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.AMNMachineImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getAMNMachine()
	 * @generated
	 */
	int AMN_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMN_MACHINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMN_MACHINE__VARIABLES = 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMN_MACHINE__OPERATIONS = 2;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMN_MACHINE__INVARIANTS = 3;

	/**
	 * The feature id for the '<em><b>Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMN_MACHINE__SETS = 4;

	/**
	 * The number of structural features of the '<em>AMN Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMN_MACHINE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>AMN Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMN_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.VariableImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.OperationImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY = 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.SubstitutionImpl <em>Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.SubstitutionImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getSubstitution()
	 * @generated
	 */
	int SUBSTITUTION = 3;

	/**
	 * The number of structural features of the '<em>Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.ExpressionImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.StringLiteralImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.VarRefImpl <em>Var Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.VarRefImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getVarRef()
	 * @generated
	 */
	int VAR_REF = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.SetMembershipImpl <em>Set Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.SetMembershipImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getSetMembership()
	 * @generated
	 */
	int SET_MEMBERSHIP = 6;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_MEMBERSHIP__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_MEMBERSHIP__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_MEMBERSHIP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_MEMBERSHIP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.ConjuctionImpl <em>Conjuction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.ConjuctionImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getConjuction()
	 * @generated
	 */
	int CONJUCTION = 7;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUCTION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUCTION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conjuction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conjuction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUCTION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.InvariantPredicateImpl <em>Invariant Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.InvariantPredicateImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getInvariantPredicate()
	 * @generated
	 */
	int INVARIANT_PREDICATE = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_PREDICATE__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Invariant Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_PREDICATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Invariant Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.SetDefinitionImpl <em>Set Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.SetDefinitionImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getSetDefinition()
	 * @generated
	 */
	int SET_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DEFINITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Set Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Set Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.AssignSubtitutionImpl <em>Assign Subtitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.AssignSubtitutionImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getAssignSubtitution()
	 * @generated
	 */
	int ASSIGN_SUBTITUTION = 11;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_SUBTITUTION__VARIABLE = SUBSTITUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_SUBTITUTION__VALUE = SUBSTITUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assign Subtitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_SUBTITUTION_FEATURE_COUNT = SUBSTITUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assign Subtitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_SUBTITUTION_OPERATION_COUNT = SUBSTITUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.SkipSubtitutionImpl <em>Skip Subtitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.SkipSubtitutionImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getSkipSubtitution()
	 * @generated
	 */
	int SKIP_SUBTITUTION = 12;

	/**
	 * The number of structural features of the '<em>Skip Subtitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_SUBTITUTION_FEATURE_COUNT = SUBSTITUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Skip Subtitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_SUBTITUTION_OPERATION_COUNT = SUBSTITUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.AnySubtitutionImpl <em>Any Subtitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.AnySubtitutionImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getAnySubtitution()
	 * @generated
	 */
	int ANY_SUBTITUTION = 13;

	/**
	 * The feature id for the '<em><b>Bound Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SUBTITUTION__BOUND_VAR = SUBSTITUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SUBTITUTION__CONDITION = SUBSTITUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Then Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SUBTITUTION__THEN_BODY = SUBSTITUTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Any Subtitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SUBTITUTION_FEATURE_COUNT = SUBSTITUTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Any Subtitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SUBTITUTION_OPERATION_COUNT = SUBSTITUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.SelectSubtitutionImpl <em>Select Subtitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.SelectSubtitutionImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getSelectSubtitution()
	 * @generated
	 */
	int SELECT_SUBTITUTION = 14;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_SUBTITUTION__CONDITION = SUBSTITUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_SUBTITUTION__THEN_BODY = SUBSTITUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Select Subtitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_SUBTITUTION_FEATURE_COUNT = SUBSTITUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Select Subtitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_SUBTITUTION_OPERATION_COUNT = SUBSTITUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.IfSubtitutionImpl <em>If Subtitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.IfSubtitutionImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getIfSubtitution()
	 * @generated
	 */
	int IF_SUBTITUTION = 15;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_SUBTITUTION__CONDITION = SUBSTITUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_SUBTITUTION__THEN_BODY = SUBSTITUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_SUBTITUTION__ELSE_BODY = SUBSTITUTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Subtitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_SUBTITUTION_FEATURE_COUNT = SUBSTITUTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Subtitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_SUBTITUTION_OPERATION_COUNT = SUBSTITUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.SequentialSubtitutionImpl <em>Sequential Subtitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.SequentialSubtitutionImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getSequentialSubtitution()
	 * @generated
	 */
	int SEQUENTIAL_SUBTITUTION = 16;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SUBTITUTION__FIRST = SUBSTITUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SUBTITUTION__SECOND = SUBSTITUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequential Subtitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SUBTITUTION_FEATURE_COUNT = SUBSTITUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sequential Subtitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_SUBTITUTION_OPERATION_COUNT = SUBSTITUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.amn.impl.PreSubtitutionImpl <em>Pre Subtitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.amn.impl.PreSubtitutionImpl
	 * @see sQL2AMN.amn.impl.AmnPackageImpl#getPreSubtitution()
	 * @generated
	 */
	int PRE_SUBTITUTION = 17;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_SUBTITUTION__GUARD = SUBSTITUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_SUBTITUTION__BODY = SUBSTITUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pre Subtitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_SUBTITUTION_FEATURE_COUNT = SUBSTITUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pre Subtitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_SUBTITUTION_OPERATION_COUNT = SUBSTITUTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.AMNMachine <em>AMN Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AMN Machine</em>'.
	 * @see sQL2AMN.amn.AMNMachine
	 * @generated
	 */
	EClass getAMNMachine();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.amn.AMNMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sQL2AMN.amn.AMNMachine#getName()
	 * @see #getAMNMachine()
	 * @generated
	 */
	EAttribute getAMNMachine_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sQL2AMN.amn.AMNMachine#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see sQL2AMN.amn.AMNMachine#getVariables()
	 * @see #getAMNMachine()
	 * @generated
	 */
	EReference getAMNMachine_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link sQL2AMN.amn.AMNMachine#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see sQL2AMN.amn.AMNMachine#getOperations()
	 * @see #getAMNMachine()
	 * @generated
	 */
	EReference getAMNMachine_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link sQL2AMN.amn.AMNMachine#getInvariants <em>Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariants</em>'.
	 * @see sQL2AMN.amn.AMNMachine#getInvariants()
	 * @see #getAMNMachine()
	 * @generated
	 */
	EReference getAMNMachine_Invariants();

	/**
	 * Returns the meta object for the containment reference list '{@link sQL2AMN.amn.AMNMachine#getSets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sets</em>'.
	 * @see sQL2AMN.amn.AMNMachine#getSets()
	 * @see #getAMNMachine()
	 * @generated
	 */
	EReference getAMNMachine_Sets();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see sQL2AMN.amn.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.amn.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sQL2AMN.amn.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.amn.Variable#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see sQL2AMN.amn.Variable#getTypeName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_TypeName();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see sQL2AMN.amn.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.amn.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sQL2AMN.amn.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the containment reference '{@link sQL2AMN.amn.Operation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see sQL2AMN.amn.Operation#getBody()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Body();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.Substitution <em>Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substitution</em>'.
	 * @see sQL2AMN.amn.Substitution
	 * @generated
	 */
	EClass getSubstitution();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see sQL2AMN.amn.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.amn.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sQL2AMN.amn.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.VarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Ref</em>'.
	 * @see sQL2AMN.amn.VarRef
	 * @generated
	 */
	EClass getVarRef();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.amn.VarRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sQL2AMN.amn.VarRef#getName()
	 * @see #getVarRef()
	 * @generated
	 */
	EAttribute getVarRef_Name();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.SetMembership <em>Set Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Membership</em>'.
	 * @see sQL2AMN.amn.SetMembership
	 * @generated
	 */
	EClass getSetMembership();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.SetMembership#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see sQL2AMN.amn.SetMembership#getLeft()
	 * @see #getSetMembership()
	 * @generated
	 */
	EReference getSetMembership_Left();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.SetMembership#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see sQL2AMN.amn.SetMembership#getRight()
	 * @see #getSetMembership()
	 * @generated
	 */
	EReference getSetMembership_Right();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.Conjuction <em>Conjuction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjuction</em>'.
	 * @see sQL2AMN.amn.Conjuction
	 * @generated
	 */
	EClass getConjuction();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.Conjuction#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see sQL2AMN.amn.Conjuction#getLeft()
	 * @see #getConjuction()
	 * @generated
	 */
	EReference getConjuction_Left();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.Conjuction#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see sQL2AMN.amn.Conjuction#getRight()
	 * @see #getConjuction()
	 * @generated
	 */
	EReference getConjuction_Right();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.InvariantPredicate <em>Invariant Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invariant Predicate</em>'.
	 * @see sQL2AMN.amn.InvariantPredicate
	 * @generated
	 */
	EClass getInvariantPredicate();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.amn.InvariantPredicate#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see sQL2AMN.amn.InvariantPredicate#getText()
	 * @see #getInvariantPredicate()
	 * @generated
	 */
	EAttribute getInvariantPredicate_Text();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.SetDefinition <em>Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Definition</em>'.
	 * @see sQL2AMN.amn.SetDefinition
	 * @generated
	 */
	EClass getSetDefinition();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.amn.SetDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sQL2AMN.amn.SetDefinition#getName()
	 * @see #getSetDefinition()
	 * @generated
	 */
	EAttribute getSetDefinition_Name();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see sQL2AMN.amn.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.AssignSubtitution <em>Assign Subtitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Subtitution</em>'.
	 * @see sQL2AMN.amn.AssignSubtitution
	 * @generated
	 */
	EClass getAssignSubtitution();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.amn.AssignSubtitution#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see sQL2AMN.amn.AssignSubtitution#getVariable()
	 * @see #getAssignSubtitution()
	 * @generated
	 */
	EAttribute getAssignSubtitution_Variable();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.AssignSubtitution#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see sQL2AMN.amn.AssignSubtitution#getValue()
	 * @see #getAssignSubtitution()
	 * @generated
	 */
	EReference getAssignSubtitution_Value();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.SkipSubtitution <em>Skip Subtitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skip Subtitution</em>'.
	 * @see sQL2AMN.amn.SkipSubtitution
	 * @generated
	 */
	EClass getSkipSubtitution();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.AnySubtitution <em>Any Subtitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Subtitution</em>'.
	 * @see sQL2AMN.amn.AnySubtitution
	 * @generated
	 */
	EClass getAnySubtitution();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.amn.AnySubtitution#getBoundVar <em>Bound Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound Var</em>'.
	 * @see sQL2AMN.amn.AnySubtitution#getBoundVar()
	 * @see #getAnySubtitution()
	 * @generated
	 */
	EAttribute getAnySubtitution_BoundVar();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.AnySubtitution#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see sQL2AMN.amn.AnySubtitution#getCondition()
	 * @see #getAnySubtitution()
	 * @generated
	 */
	EReference getAnySubtitution_Condition();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.AnySubtitution#getThenBody <em>Then Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then Body</em>'.
	 * @see sQL2AMN.amn.AnySubtitution#getThenBody()
	 * @see #getAnySubtitution()
	 * @generated
	 */
	EReference getAnySubtitution_ThenBody();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.SelectSubtitution <em>Select Subtitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Subtitution</em>'.
	 * @see sQL2AMN.amn.SelectSubtitution
	 * @generated
	 */
	EClass getSelectSubtitution();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.SelectSubtitution#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see sQL2AMN.amn.SelectSubtitution#getCondition()
	 * @see #getSelectSubtitution()
	 * @generated
	 */
	EReference getSelectSubtitution_Condition();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.SelectSubtitution#getThenBody <em>Then Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then Body</em>'.
	 * @see sQL2AMN.amn.SelectSubtitution#getThenBody()
	 * @see #getSelectSubtitution()
	 * @generated
	 */
	EReference getSelectSubtitution_ThenBody();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.IfSubtitution <em>If Subtitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Subtitution</em>'.
	 * @see sQL2AMN.amn.IfSubtitution
	 * @generated
	 */
	EClass getIfSubtitution();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.IfSubtitution#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see sQL2AMN.amn.IfSubtitution#getCondition()
	 * @see #getIfSubtitution()
	 * @generated
	 */
	EReference getIfSubtitution_Condition();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.IfSubtitution#getThenBody <em>Then Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then Body</em>'.
	 * @see sQL2AMN.amn.IfSubtitution#getThenBody()
	 * @see #getIfSubtitution()
	 * @generated
	 */
	EReference getIfSubtitution_ThenBody();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.IfSubtitution#getElseBody <em>Else Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Body</em>'.
	 * @see sQL2AMN.amn.IfSubtitution#getElseBody()
	 * @see #getIfSubtitution()
	 * @generated
	 */
	EReference getIfSubtitution_ElseBody();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.SequentialSubtitution <em>Sequential Subtitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Subtitution</em>'.
	 * @see sQL2AMN.amn.SequentialSubtitution
	 * @generated
	 */
	EClass getSequentialSubtitution();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.SequentialSubtitution#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see sQL2AMN.amn.SequentialSubtitution#getFirst()
	 * @see #getSequentialSubtitution()
	 * @generated
	 */
	EReference getSequentialSubtitution_First();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.SequentialSubtitution#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second</em>'.
	 * @see sQL2AMN.amn.SequentialSubtitution#getSecond()
	 * @see #getSequentialSubtitution()
	 * @generated
	 */
	EReference getSequentialSubtitution_Second();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.amn.PreSubtitution <em>Pre Subtitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Subtitution</em>'.
	 * @see sQL2AMN.amn.PreSubtitution
	 * @generated
	 */
	EClass getPreSubtitution();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.PreSubtitution#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see sQL2AMN.amn.PreSubtitution#getGuard()
	 * @see #getPreSubtitution()
	 * @generated
	 */
	EReference getPreSubtitution_Guard();

	/**
	 * Returns the meta object for the reference '{@link sQL2AMN.amn.PreSubtitution#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see sQL2AMN.amn.PreSubtitution#getBody()
	 * @see #getPreSubtitution()
	 * @generated
	 */
	EReference getPreSubtitution_Body();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AmnFactory getAmnFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.AMNMachineImpl <em>AMN Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.AMNMachineImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getAMNMachine()
		 * @generated
		 */
		EClass AMN_MACHINE = eINSTANCE.getAMNMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMN_MACHINE__NAME = eINSTANCE.getAMNMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMN_MACHINE__VARIABLES = eINSTANCE.getAMNMachine_Variables();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMN_MACHINE__OPERATIONS = eINSTANCE.getAMNMachine_Operations();

		/**
		 * The meta object literal for the '<em><b>Invariants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMN_MACHINE__INVARIANTS = eINSTANCE.getAMNMachine_Invariants();

		/**
		 * The meta object literal for the '<em><b>Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMN_MACHINE__SETS = eINSTANCE.getAMNMachine_Sets();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.VariableImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE_NAME = eINSTANCE.getVariable_TypeName();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.OperationImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__BODY = eINSTANCE.getOperation_Body();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.SubstitutionImpl <em>Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.SubstitutionImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getSubstitution()
		 * @generated
		 */
		EClass SUBSTITUTION = eINSTANCE.getSubstitution();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.StringLiteralImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.VarRefImpl <em>Var Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.VarRefImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getVarRef()
		 * @generated
		 */
		EClass VAR_REF = eINSTANCE.getVarRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_REF__NAME = eINSTANCE.getVarRef_Name();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.SetMembershipImpl <em>Set Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.SetMembershipImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getSetMembership()
		 * @generated
		 */
		EClass SET_MEMBERSHIP = eINSTANCE.getSetMembership();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_MEMBERSHIP__LEFT = eINSTANCE.getSetMembership_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_MEMBERSHIP__RIGHT = eINSTANCE.getSetMembership_Right();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.ConjuctionImpl <em>Conjuction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.ConjuctionImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getConjuction()
		 * @generated
		 */
		EClass CONJUCTION = eINSTANCE.getConjuction();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONJUCTION__LEFT = eINSTANCE.getConjuction_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONJUCTION__RIGHT = eINSTANCE.getConjuction_Right();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.InvariantPredicateImpl <em>Invariant Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.InvariantPredicateImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getInvariantPredicate()
		 * @generated
		 */
		EClass INVARIANT_PREDICATE = eINSTANCE.getInvariantPredicate();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVARIANT_PREDICATE__TEXT = eINSTANCE.getInvariantPredicate_Text();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.SetDefinitionImpl <em>Set Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.SetDefinitionImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getSetDefinition()
		 * @generated
		 */
		EClass SET_DEFINITION = eINSTANCE.getSetDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_DEFINITION__NAME = eINSTANCE.getSetDefinition_Name();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.ExpressionImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.AssignSubtitutionImpl <em>Assign Subtitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.AssignSubtitutionImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getAssignSubtitution()
		 * @generated
		 */
		EClass ASSIGN_SUBTITUTION = eINSTANCE.getAssignSubtitution();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN_SUBTITUTION__VARIABLE = eINSTANCE.getAssignSubtitution_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_SUBTITUTION__VALUE = eINSTANCE.getAssignSubtitution_Value();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.SkipSubtitutionImpl <em>Skip Subtitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.SkipSubtitutionImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getSkipSubtitution()
		 * @generated
		 */
		EClass SKIP_SUBTITUTION = eINSTANCE.getSkipSubtitution();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.AnySubtitutionImpl <em>Any Subtitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.AnySubtitutionImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getAnySubtitution()
		 * @generated
		 */
		EClass ANY_SUBTITUTION = eINSTANCE.getAnySubtitution();

		/**
		 * The meta object literal for the '<em><b>Bound Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_SUBTITUTION__BOUND_VAR = eINSTANCE.getAnySubtitution_BoundVar();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_SUBTITUTION__CONDITION = eINSTANCE.getAnySubtitution_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_SUBTITUTION__THEN_BODY = eINSTANCE.getAnySubtitution_ThenBody();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.SelectSubtitutionImpl <em>Select Subtitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.SelectSubtitutionImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getSelectSubtitution()
		 * @generated
		 */
		EClass SELECT_SUBTITUTION = eINSTANCE.getSelectSubtitution();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_SUBTITUTION__CONDITION = eINSTANCE.getSelectSubtitution_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_SUBTITUTION__THEN_BODY = eINSTANCE.getSelectSubtitution_ThenBody();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.IfSubtitutionImpl <em>If Subtitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.IfSubtitutionImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getIfSubtitution()
		 * @generated
		 */
		EClass IF_SUBTITUTION = eINSTANCE.getIfSubtitution();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_SUBTITUTION__CONDITION = eINSTANCE.getIfSubtitution_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_SUBTITUTION__THEN_BODY = eINSTANCE.getIfSubtitution_ThenBody();

		/**
		 * The meta object literal for the '<em><b>Else Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_SUBTITUTION__ELSE_BODY = eINSTANCE.getIfSubtitution_ElseBody();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.SequentialSubtitutionImpl <em>Sequential Subtitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.SequentialSubtitutionImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getSequentialSubtitution()
		 * @generated
		 */
		EClass SEQUENTIAL_SUBTITUTION = eINSTANCE.getSequentialSubtitution();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_SUBTITUTION__FIRST = eINSTANCE.getSequentialSubtitution_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_SUBTITUTION__SECOND = eINSTANCE.getSequentialSubtitution_Second();

		/**
		 * The meta object literal for the '{@link sQL2AMN.amn.impl.PreSubtitutionImpl <em>Pre Subtitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.amn.impl.PreSubtitutionImpl
		 * @see sQL2AMN.amn.impl.AmnPackageImpl#getPreSubtitution()
		 * @generated
		 */
		EClass PRE_SUBTITUTION = eINSTANCE.getPreSubtitution();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_SUBTITUTION__GUARD = eINSTANCE.getPreSubtitution_Guard();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_SUBTITUTION__BODY = eINSTANCE.getPreSubtitution_Body();

	}

} //AmnPackage
