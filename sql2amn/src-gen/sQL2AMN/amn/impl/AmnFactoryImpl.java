/**
 */
package sQL2AMN.amn.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sQL2AMN.amn.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmnFactoryImpl extends EFactoryImpl implements AmnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmnFactory init() {
		try {
			AmnFactory theAmnFactory = (AmnFactory) EPackage.Registry.INSTANCE.getEFactory(AmnPackage.eNS_URI);
			if (theAmnFactory != null) {
				return theAmnFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AmnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmnFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AmnPackage.AMN_MACHINE:
			return createAMNMachine();
		case AmnPackage.VARIABLE:
			return createVariable();
		case AmnPackage.OPERATION:
			return createOperation();
		case AmnPackage.STRING_LITERAL:
			return createStringLiteral();
		case AmnPackage.VAR_REF:
			return createVarRef();
		case AmnPackage.SET_MEMBERSHIP:
			return createSetMembership();
		case AmnPackage.CONJUCTION:
			return createConjuction();
		case AmnPackage.INVARIANT_PREDICATE:
			return createInvariantPredicate();
		case AmnPackage.SET_DEFINITION:
			return createSetDefinition();
		case AmnPackage.ASSIGN_SUBTITUTION:
			return createAssignSubtitution();
		case AmnPackage.SKIP_SUBTITUTION:
			return createSkipSubtitution();
		case AmnPackage.ANY_SUBTITUTION:
			return createAnySubtitution();
		case AmnPackage.SELECT_SUBTITUTION:
			return createSelectSubtitution();
		case AmnPackage.IF_SUBTITUTION:
			return createIfSubtitution();
		case AmnPackage.SEQUENTIAL_SUBTITUTION:
			return createSequentialSubtitution();
		case AmnPackage.PRE_SUBTITUTION:
			return createPreSubtitution();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AMNMachine createAMNMachine() {
		AMNMachineImpl amnMachine = new AMNMachineImpl();
		return amnMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarRef createVarRef() {
		VarRefImpl varRef = new VarRefImpl();
		return varRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetMembership createSetMembership() {
		SetMembershipImpl setMembership = new SetMembershipImpl();
		return setMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conjuction createConjuction() {
		ConjuctionImpl conjuction = new ConjuctionImpl();
		return conjuction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvariantPredicate createInvariantPredicate() {
		InvariantPredicateImpl invariantPredicate = new InvariantPredicateImpl();
		return invariantPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetDefinition createSetDefinition() {
		SetDefinitionImpl setDefinition = new SetDefinitionImpl();
		return setDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignSubtitution createAssignSubtitution() {
		AssignSubtitutionImpl assignSubtitution = new AssignSubtitutionImpl();
		return assignSubtitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkipSubtitution createSkipSubtitution() {
		SkipSubtitutionImpl skipSubtitution = new SkipSubtitutionImpl();
		return skipSubtitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnySubtitution createAnySubtitution() {
		AnySubtitutionImpl anySubtitution = new AnySubtitutionImpl();
		return anySubtitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectSubtitution createSelectSubtitution() {
		SelectSubtitutionImpl selectSubtitution = new SelectSubtitutionImpl();
		return selectSubtitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfSubtitution createIfSubtitution() {
		IfSubtitutionImpl ifSubtitution = new IfSubtitutionImpl();
		return ifSubtitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequentialSubtitution createSequentialSubtitution() {
		SequentialSubtitutionImpl sequentialSubtitution = new SequentialSubtitutionImpl();
		return sequentialSubtitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreSubtitution createPreSubtitution() {
		PreSubtitutionImpl preSubtitution = new PreSubtitutionImpl();
		return preSubtitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmnPackage getAmnPackage() {
		return (AmnPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AmnPackage getPackage() {
		return AmnPackage.eINSTANCE;
	}

} //AmnFactoryImpl
