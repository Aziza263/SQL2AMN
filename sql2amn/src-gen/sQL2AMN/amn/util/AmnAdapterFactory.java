/**
 */
package sQL2AMN.amn.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sQL2AMN.amn.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sQL2AMN.amn.AmnPackage
 * @generated
 */
public class AmnAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AmnPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmnAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AmnPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmnSwitch<Adapter> modelSwitch = new AmnSwitch<Adapter>() {
		@Override
		public Adapter caseAMNMachine(AMNMachine object) {
			return createAMNMachineAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseSubstitution(Substitution object) {
			return createSubstitutionAdapter();
		}

		@Override
		public Adapter caseStringLiteral(StringLiteral object) {
			return createStringLiteralAdapter();
		}

		@Override
		public Adapter caseVarRef(VarRef object) {
			return createVarRefAdapter();
		}

		@Override
		public Adapter caseSetMembership(SetMembership object) {
			return createSetMembershipAdapter();
		}

		@Override
		public Adapter caseConjuction(Conjuction object) {
			return createConjuctionAdapter();
		}

		@Override
		public Adapter caseInvariantPredicate(InvariantPredicate object) {
			return createInvariantPredicateAdapter();
		}

		@Override
		public Adapter caseSetDefinition(SetDefinition object) {
			return createSetDefinitionAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseAssignSubtitution(AssignSubtitution object) {
			return createAssignSubtitutionAdapter();
		}

		@Override
		public Adapter caseSkipSubtitution(SkipSubtitution object) {
			return createSkipSubtitutionAdapter();
		}

		@Override
		public Adapter caseAnySubtitution(AnySubtitution object) {
			return createAnySubtitutionAdapter();
		}

		@Override
		public Adapter caseSelectSubtitution(SelectSubtitution object) {
			return createSelectSubtitutionAdapter();
		}

		@Override
		public Adapter caseIfSubtitution(IfSubtitution object) {
			return createIfSubtitutionAdapter();
		}

		@Override
		public Adapter caseSequentialSubtitution(SequentialSubtitution object) {
			return createSequentialSubtitutionAdapter();
		}

		@Override
		public Adapter casePreSubtitution(PreSubtitution object) {
			return createPreSubtitutionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.AMNMachine <em>AMN Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.AMNMachine
	 * @generated
	 */
	public Adapter createAMNMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.Substitution <em>Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.Substitution
	 * @generated
	 */
	public Adapter createSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.StringLiteral
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.VarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.VarRef
	 * @generated
	 */
	public Adapter createVarRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.SetMembership <em>Set Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.SetMembership
	 * @generated
	 */
	public Adapter createSetMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.Conjuction <em>Conjuction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.Conjuction
	 * @generated
	 */
	public Adapter createConjuctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.InvariantPredicate <em>Invariant Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.InvariantPredicate
	 * @generated
	 */
	public Adapter createInvariantPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.SetDefinition <em>Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.SetDefinition
	 * @generated
	 */
	public Adapter createSetDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.AssignSubtitution <em>Assign Subtitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.AssignSubtitution
	 * @generated
	 */
	public Adapter createAssignSubtitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.SkipSubtitution <em>Skip Subtitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.SkipSubtitution
	 * @generated
	 */
	public Adapter createSkipSubtitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.AnySubtitution <em>Any Subtitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.AnySubtitution
	 * @generated
	 */
	public Adapter createAnySubtitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.SelectSubtitution <em>Select Subtitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.SelectSubtitution
	 * @generated
	 */
	public Adapter createSelectSubtitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.IfSubtitution <em>If Subtitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.IfSubtitution
	 * @generated
	 */
	public Adapter createIfSubtitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.SequentialSubtitution <em>Sequential Subtitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.SequentialSubtitution
	 * @generated
	 */
	public Adapter createSequentialSubtitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sQL2AMN.amn.PreSubtitution <em>Pre Subtitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sQL2AMN.amn.PreSubtitution
	 * @generated
	 */
	public Adapter createPreSubtitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AmnAdapterFactory
