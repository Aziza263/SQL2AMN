/**
 */
package sQL2AMN.sql.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sQL2AMN.sql.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlFactoryImpl extends EFactoryImpl implements SqlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SqlFactory init() {
		try {
			SqlFactory theSqlFactory = (SqlFactory) EPackage.Registry.INSTANCE.getEFactory(SqlPackage.eNS_URI);
			if (theSqlFactory != null) {
				return theSqlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SqlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlFactoryImpl() {
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
		case SqlPackage.SQL_PROGRAM:
			return createSQLProgram();
		case SqlPackage.PROCEDURE:
			return createProcedure();
		case SqlPackage.CREATE_TABLE_STATEMENT:
			return createCreateTableStatement();
		case SqlPackage.INSERT_STATEMENT:
			return createInsertStatement();
		case SqlPackage.SELECT_INTO_STATEMENT:
			return createSelectIntoStatement();
		case SqlPackage.IF_STATEMENT:
			return createIfStatement();
		case SqlPackage.FOR_LOOP_STATEMENT:
			return createForLoopStatement();
		case SqlPackage.VARIABLE_DECLARATION:
			return createVariableDeclaration();
		case SqlPackage.LITERAL_EXPRESSION:
			return createLiteralExpression();
		case SqlPackage.VARIABLE_EXPRESSION:
			return createVariableExpression();
		case SqlPackage.FIELD_ACESS_EXPRESSION:
			return createFieldAcessExpression();
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
	public SQLProgram createSQLProgram() {
		SQLProgramImpl sqlProgram = new SQLProgramImpl();
		return sqlProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateTableStatement createCreateTableStatement() {
		CreateTableStatementImpl createTableStatement = new CreateTableStatementImpl();
		return createTableStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsertStatement createInsertStatement() {
		InsertStatementImpl insertStatement = new InsertStatementImpl();
		return insertStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectIntoStatement createSelectIntoStatement() {
		SelectIntoStatementImpl selectIntoStatement = new SelectIntoStatementImpl();
		return selectIntoStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForLoopStatement createForLoopStatement() {
		ForLoopStatementImpl forLoopStatement = new ForLoopStatementImpl();
		return forLoopStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralExpression createLiteralExpression() {
		LiteralExpressionImpl literalExpression = new LiteralExpressionImpl();
		return literalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableExpression createVariableExpression() {
		VariableExpressionImpl variableExpression = new VariableExpressionImpl();
		return variableExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAcessExpression createFieldAcessExpression() {
		FieldAcessExpressionImpl fieldAcessExpression = new FieldAcessExpressionImpl();
		return fieldAcessExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqlPackage getSqlPackage() {
		return (SqlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SqlPackage getPackage() {
		return SqlPackage.eINSTANCE;
	}

} //SqlFactoryImpl
