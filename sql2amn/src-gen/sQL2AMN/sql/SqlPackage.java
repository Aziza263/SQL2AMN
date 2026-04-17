/**
 */
package sQL2AMN.sql;

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
 * @see sQL2AMN.sql.SqlFactory
 * @model kind="package"
 * @generated
 */
public interface SqlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sql";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sql/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sql";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SqlPackage eINSTANCE = sQL2AMN.sql.impl.SqlPackageImpl.init();

	/**
	 * The meta object id for the '{@link sQL2AMN.sql.impl.SQLProgramImpl <em>SQL Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.sql.impl.SQLProgramImpl
	 * @see sQL2AMN.sql.impl.SqlPackageImpl#getSQLProgram()
	 * @generated
	 */
	int SQL_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PROGRAM__PROCEDURES = 0;

	/**
	 * The number of structural features of the '<em>SQL Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SQL Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.sql.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.sql.impl.ProcedureImpl
	 * @see sQL2AMN.sql.impl.SqlPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__BODY = 1;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__DECLARATIONS = 2;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.sql.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.sql.impl.StatementImpl
	 * @see sQL2AMN.sql.impl.SqlPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.sql.impl.CreateTableStatementImpl <em>Create Table Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.sql.impl.CreateTableStatementImpl
	 * @see sQL2AMN.sql.impl.SqlPackageImpl#getCreateTableStatement()
	 * @generated
	 */
	int CREATE_TABLE_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_STATEMENT__TABLE_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Table Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create Table Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.sql.impl.InsertStatementImpl <em>Insert Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.sql.impl.InsertStatementImpl
	 * @see sQL2AMN.sql.impl.SqlPackageImpl#getInsertStatement()
	 * @generated
	 */
	int INSERT_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_STATEMENT__TABLE_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_STATEMENT__COLUMNS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Insert Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Insert Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.sql.impl.SelectIntoStatementImpl <em>Select Into Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.sql.impl.SelectIntoStatementImpl
	 * @see sQL2AMN.sql.impl.SqlPackageImpl#getSelectIntoStatement()
	 * @generated
	 */
	int SELECT_INTO_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Target Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INTO_STATEMENT__TARGET_VAR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INTO_STATEMENT__SOURCE_COLUMN = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INTO_STATEMENT__FROM_TABLE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Select Into Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INTO_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Select Into Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INTO_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.sql.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.sql.impl.IfStatementImpl
	 * @see sQL2AMN.sql.impl.SqlPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Then Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__THEN_BRANCH = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_BRANCH = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.sql.impl.ForLoopStatementImpl <em>For Loop Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.sql.impl.ForLoopStatementImpl
	 * @see sQL2AMN.sql.impl.SqlPackageImpl#getForLoopStatement()
	 * @generated
	 */
	int FOR_LOOP_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Loop Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_STATEMENT__LOOP_VAR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_STATEMENT__FROM_TABLE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>For Loop Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>For Loop Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.sql.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.sql.impl.VariableDeclarationImpl
	 * @see sQL2AMN.sql.impl.SqlPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__TYPE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.sql.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.sql.impl.ExpressionImpl
	 * @see sQL2AMN.sql.impl.SqlPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 9;

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
	 * The meta object id for the '{@link sQL2AMN.sql.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.sql.impl.LiteralExpressionImpl
	 * @see sQL2AMN.sql.impl.SqlPackageImpl#getLiteralExpression()
	 * @generated
	 */
	int LITERAL_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.sql.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.sql.impl.VariableExpressionImpl
	 * @see sQL2AMN.sql.impl.SqlPackageImpl#getVariableExpression()
	 * @generated
	 */
	int VARIABLE_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sQL2AMN.sql.impl.FieldAcessExpressionImpl <em>Field Acess Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sQL2AMN.sql.impl.FieldAcessExpressionImpl
	 * @see sQL2AMN.sql.impl.SqlPackageImpl#getFieldAcessExpression()
	 * @generated
	 */
	int FIELD_ACESS_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACESS_EXPRESSION__OBJECT_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACESS_EXPRESSION__FIELD_NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Acess Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACESS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field Acess Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACESS_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link sQL2AMN.sql.SQLProgram <em>SQL Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Program</em>'.
	 * @see sQL2AMN.sql.SQLProgram
	 * @generated
	 */
	EClass getSQLProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link sQL2AMN.sql.SQLProgram#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procedures</em>'.
	 * @see sQL2AMN.sql.SQLProgram#getProcedures()
	 * @see #getSQLProgram()
	 * @generated
	 */
	EReference getSQLProgram_Procedures();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.sql.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see sQL2AMN.sql.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.sql.Procedure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sQL2AMN.sql.Procedure#getName()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sQL2AMN.sql.Procedure#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see sQL2AMN.sql.Procedure#getBody()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link sQL2AMN.sql.Procedure#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see sQL2AMN.sql.Procedure#getDeclarations()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Declarations();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.sql.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see sQL2AMN.sql.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.sql.CreateTableStatement <em>Create Table Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Table Statement</em>'.
	 * @see sQL2AMN.sql.CreateTableStatement
	 * @generated
	 */
	EClass getCreateTableStatement();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.sql.CreateTableStatement#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see sQL2AMN.sql.CreateTableStatement#getTableName()
	 * @see #getCreateTableStatement()
	 * @generated
	 */
	EAttribute getCreateTableStatement_TableName();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.sql.InsertStatement <em>Insert Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Statement</em>'.
	 * @see sQL2AMN.sql.InsertStatement
	 * @generated
	 */
	EClass getInsertStatement();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.sql.InsertStatement#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see sQL2AMN.sql.InsertStatement#getTableName()
	 * @see #getInsertStatement()
	 * @generated
	 */
	EAttribute getInsertStatement_TableName();

	/**
	 * Returns the meta object for the attribute list '{@link sQL2AMN.sql.InsertStatement#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Columns</em>'.
	 * @see sQL2AMN.sql.InsertStatement#getColumns()
	 * @see #getInsertStatement()
	 * @generated
	 */
	EAttribute getInsertStatement_Columns();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.sql.SelectIntoStatement <em>Select Into Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Into Statement</em>'.
	 * @see sQL2AMN.sql.SelectIntoStatement
	 * @generated
	 */
	EClass getSelectIntoStatement();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.sql.SelectIntoStatement#getTargetVar <em>Target Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Var</em>'.
	 * @see sQL2AMN.sql.SelectIntoStatement#getTargetVar()
	 * @see #getSelectIntoStatement()
	 * @generated
	 */
	EAttribute getSelectIntoStatement_TargetVar();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.sql.SelectIntoStatement#getSourceColumn <em>Source Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Column</em>'.
	 * @see sQL2AMN.sql.SelectIntoStatement#getSourceColumn()
	 * @see #getSelectIntoStatement()
	 * @generated
	 */
	EAttribute getSelectIntoStatement_SourceColumn();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.sql.SelectIntoStatement#getFromTable <em>From Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Table</em>'.
	 * @see sQL2AMN.sql.SelectIntoStatement#getFromTable()
	 * @see #getSelectIntoStatement()
	 * @generated
	 */
	EAttribute getSelectIntoStatement_FromTable();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.sql.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see sQL2AMN.sql.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link sQL2AMN.sql.IfStatement#getThenBranch <em>Then Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then Branch</em>'.
	 * @see sQL2AMN.sql.IfStatement#getThenBranch()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ThenBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link sQL2AMN.sql.IfStatement#getElseBranch <em>Else Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Branch</em>'.
	 * @see sQL2AMN.sql.IfStatement#getElseBranch()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseBranch();

	/**
	 * Returns the meta object for the containment reference '{@link sQL2AMN.sql.IfStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see sQL2AMN.sql.IfStatement#getCondition()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Condition();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.sql.ForLoopStatement <em>For Loop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop Statement</em>'.
	 * @see sQL2AMN.sql.ForLoopStatement
	 * @generated
	 */
	EClass getForLoopStatement();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.sql.ForLoopStatement#getLoopVar <em>Loop Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Var</em>'.
	 * @see sQL2AMN.sql.ForLoopStatement#getLoopVar()
	 * @see #getForLoopStatement()
	 * @generated
	 */
	EAttribute getForLoopStatement_LoopVar();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.sql.ForLoopStatement#getFromTable <em>From Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Table</em>'.
	 * @see sQL2AMN.sql.ForLoopStatement#getFromTable()
	 * @see #getForLoopStatement()
	 * @generated
	 */
	EAttribute getForLoopStatement_FromTable();

	/**
	 * Returns the meta object for the containment reference list '{@link sQL2AMN.sql.ForLoopStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see sQL2AMN.sql.ForLoopStatement#getBody()
	 * @see #getForLoopStatement()
	 * @generated
	 */
	EReference getForLoopStatement_Body();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.sql.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see sQL2AMN.sql.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.sql.VariableDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sQL2AMN.sql.VariableDeclaration#getName()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.sql.VariableDeclaration#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see sQL2AMN.sql.VariableDeclaration#getTypeName()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_TypeName();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.sql.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see sQL2AMN.sql.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.sql.LiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Expression</em>'.
	 * @see sQL2AMN.sql.LiteralExpression
	 * @generated
	 */
	EClass getLiteralExpression();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.sql.LiteralExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sQL2AMN.sql.LiteralExpression#getValue()
	 * @see #getLiteralExpression()
	 * @generated
	 */
	EAttribute getLiteralExpression_Value();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.sql.VariableExpression <em>Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Expression</em>'.
	 * @see sQL2AMN.sql.VariableExpression
	 * @generated
	 */
	EClass getVariableExpression();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.sql.VariableExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sQL2AMN.sql.VariableExpression#getName()
	 * @see #getVariableExpression()
	 * @generated
	 */
	EAttribute getVariableExpression_Name();

	/**
	 * Returns the meta object for class '{@link sQL2AMN.sql.FieldAcessExpression <em>Field Acess Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Acess Expression</em>'.
	 * @see sQL2AMN.sql.FieldAcessExpression
	 * @generated
	 */
	EClass getFieldAcessExpression();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.sql.FieldAcessExpression#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see sQL2AMN.sql.FieldAcessExpression#getObjectName()
	 * @see #getFieldAcessExpression()
	 * @generated
	 */
	EAttribute getFieldAcessExpression_ObjectName();

	/**
	 * Returns the meta object for the attribute '{@link sQL2AMN.sql.FieldAcessExpression#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see sQL2AMN.sql.FieldAcessExpression#getFieldName()
	 * @see #getFieldAcessExpression()
	 * @generated
	 */
	EAttribute getFieldAcessExpression_FieldName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SqlFactory getSqlFactory();

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
		 * The meta object literal for the '{@link sQL2AMN.sql.impl.SQLProgramImpl <em>SQL Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.sql.impl.SQLProgramImpl
		 * @see sQL2AMN.sql.impl.SqlPackageImpl#getSQLProgram()
		 * @generated
		 */
		EClass SQL_PROGRAM = eINSTANCE.getSQLProgram();

		/**
		 * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_PROGRAM__PROCEDURES = eINSTANCE.getSQLProgram_Procedures();

		/**
		 * The meta object literal for the '{@link sQL2AMN.sql.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.sql.impl.ProcedureImpl
		 * @see sQL2AMN.sql.impl.SqlPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__NAME = eINSTANCE.getProcedure_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__BODY = eINSTANCE.getProcedure_Body();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__DECLARATIONS = eINSTANCE.getProcedure_Declarations();

		/**
		 * The meta object literal for the '{@link sQL2AMN.sql.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.sql.impl.StatementImpl
		 * @see sQL2AMN.sql.impl.SqlPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link sQL2AMN.sql.impl.CreateTableStatementImpl <em>Create Table Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.sql.impl.CreateTableStatementImpl
		 * @see sQL2AMN.sql.impl.SqlPackageImpl#getCreateTableStatement()
		 * @generated
		 */
		EClass CREATE_TABLE_STATEMENT = eINSTANCE.getCreateTableStatement();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TABLE_STATEMENT__TABLE_NAME = eINSTANCE.getCreateTableStatement_TableName();

		/**
		 * The meta object literal for the '{@link sQL2AMN.sql.impl.InsertStatementImpl <em>Insert Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.sql.impl.InsertStatementImpl
		 * @see sQL2AMN.sql.impl.SqlPackageImpl#getInsertStatement()
		 * @generated
		 */
		EClass INSERT_STATEMENT = eINSTANCE.getInsertStatement();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_STATEMENT__TABLE_NAME = eINSTANCE.getInsertStatement_TableName();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_STATEMENT__COLUMNS = eINSTANCE.getInsertStatement_Columns();

		/**
		 * The meta object literal for the '{@link sQL2AMN.sql.impl.SelectIntoStatementImpl <em>Select Into Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.sql.impl.SelectIntoStatementImpl
		 * @see sQL2AMN.sql.impl.SqlPackageImpl#getSelectIntoStatement()
		 * @generated
		 */
		EClass SELECT_INTO_STATEMENT = eINSTANCE.getSelectIntoStatement();

		/**
		 * The meta object literal for the '<em><b>Target Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_INTO_STATEMENT__TARGET_VAR = eINSTANCE.getSelectIntoStatement_TargetVar();

		/**
		 * The meta object literal for the '<em><b>Source Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_INTO_STATEMENT__SOURCE_COLUMN = eINSTANCE.getSelectIntoStatement_SourceColumn();

		/**
		 * The meta object literal for the '<em><b>From Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_INTO_STATEMENT__FROM_TABLE = eINSTANCE.getSelectIntoStatement_FromTable();

		/**
		 * The meta object literal for the '{@link sQL2AMN.sql.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.sql.impl.IfStatementImpl
		 * @see sQL2AMN.sql.impl.SqlPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Then Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__THEN_BRANCH = eINSTANCE.getIfStatement_ThenBranch();

		/**
		 * The meta object literal for the '<em><b>Else Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE_BRANCH = eINSTANCE.getIfStatement_ElseBranch();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

		/**
		 * The meta object literal for the '{@link sQL2AMN.sql.impl.ForLoopStatementImpl <em>For Loop Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.sql.impl.ForLoopStatementImpl
		 * @see sQL2AMN.sql.impl.SqlPackageImpl#getForLoopStatement()
		 * @generated
		 */
		EClass FOR_LOOP_STATEMENT = eINSTANCE.getForLoopStatement();

		/**
		 * The meta object literal for the '<em><b>Loop Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_LOOP_STATEMENT__LOOP_VAR = eINSTANCE.getForLoopStatement_LoopVar();

		/**
		 * The meta object literal for the '<em><b>From Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_LOOP_STATEMENT__FROM_TABLE = eINSTANCE.getForLoopStatement_FromTable();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP_STATEMENT__BODY = eINSTANCE.getForLoopStatement_Body();

		/**
		 * The meta object literal for the '{@link sQL2AMN.sql.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.sql.impl.VariableDeclarationImpl
		 * @see sQL2AMN.sql.impl.SqlPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__TYPE_NAME = eINSTANCE.getVariableDeclaration_TypeName();

		/**
		 * The meta object literal for the '{@link sQL2AMN.sql.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.sql.impl.ExpressionImpl
		 * @see sQL2AMN.sql.impl.SqlPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link sQL2AMN.sql.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.sql.impl.LiteralExpressionImpl
		 * @see sQL2AMN.sql.impl.SqlPackageImpl#getLiteralExpression()
		 * @generated
		 */
		EClass LITERAL_EXPRESSION = eINSTANCE.getLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_EXPRESSION__VALUE = eINSTANCE.getLiteralExpression_Value();

		/**
		 * The meta object literal for the '{@link sQL2AMN.sql.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.sql.impl.VariableExpressionImpl
		 * @see sQL2AMN.sql.impl.SqlPackageImpl#getVariableExpression()
		 * @generated
		 */
		EClass VARIABLE_EXPRESSION = eINSTANCE.getVariableExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_EXPRESSION__NAME = eINSTANCE.getVariableExpression_Name();

		/**
		 * The meta object literal for the '{@link sQL2AMN.sql.impl.FieldAcessExpressionImpl <em>Field Acess Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sQL2AMN.sql.impl.FieldAcessExpressionImpl
		 * @see sQL2AMN.sql.impl.SqlPackageImpl#getFieldAcessExpression()
		 * @generated
		 */
		EClass FIELD_ACESS_EXPRESSION = eINSTANCE.getFieldAcessExpression();

		/**
		 * The meta object literal for the '<em><b>Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_ACESS_EXPRESSION__OBJECT_NAME = eINSTANCE.getFieldAcessExpression_ObjectName();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_ACESS_EXPRESSION__FIELD_NAME = eINSTANCE.getFieldAcessExpression_FieldName();

	}

} //SqlPackage
