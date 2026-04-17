// Generated from PlPgSQL.g4 by ANTLR 4.13.1
package SQL2AMN.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlPgSQLParser}.
 */
public interface PlPgSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PlPgSQLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PlPgSQLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PlPgSQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PlPgSQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStatement(PlPgSQLParser.CreateTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStatement(PlPgSQLParser.CreateTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void enterColumnDef(PlPgSQLParser.ColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void exitColumnDef(PlPgSQLParser.ColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#constraintDef}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDef(PlPgSQLParser.ConstraintDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#constraintDef}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDef(PlPgSQLParser.ConstraintDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(PlPgSQLParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(PlPgSQLParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#createFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunctionStatement(PlPgSQLParser.CreateFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#createFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunctionStatement(PlPgSQLParser.CreateFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#declareBlock}.
	 * @param ctx the parse tree
	 */
	void enterDeclareBlock(PlPgSQLParser.DeclareBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#declareBlock}.
	 * @param ctx the parse tree
	 */
	void exitDeclareBlock(PlPgSQLParser.DeclareBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PlPgSQLParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PlPgSQLParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#plStatement}.
	 * @param ctx the parse tree
	 */
	void enterPlStatement(PlPgSQLParser.PlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#plStatement}.
	 * @param ctx the parse tree
	 */
	void exitPlStatement(PlPgSQLParser.PlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#forLoopStatement}.
	 * @param ctx the parse tree
	 */
	void enterForLoopStatement(PlPgSQLParser.ForLoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#forLoopStatement}.
	 * @param ctx the parse tree
	 */
	void exitForLoopStatement(PlPgSQLParser.ForLoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PlPgSQLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PlPgSQLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(PlPgSQLParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(PlPgSQLParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#selectIntoStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoStatement(PlPgSQLParser.SelectIntoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#selectIntoStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoStatement(PlPgSQLParser.SelectIntoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PlPgSQLParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PlPgSQLParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNullCondition}
	 * labeled alternative in {@link PlPgSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterIsNullCondition(PlPgSQLParser.IsNullConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullCondition}
	 * labeled alternative in {@link PlPgSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitIsNullCondition(PlPgSQLParser.IsNullConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqCondition}
	 * labeled alternative in {@link PlPgSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEqCondition(PlPgSQLParser.EqConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqCondition}
	 * labeled alternative in {@link PlPgSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEqCondition(PlPgSQLParser.EqConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andCondition}
	 * labeled alternative in {@link PlPgSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAndCondition(PlPgSQLParser.AndConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andCondition}
	 * labeled alternative in {@link PlPgSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAndCondition(PlPgSQLParser.AndConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldAccess}
	 * labeled alternative in {@link PlPgSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(PlPgSQLParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldAccess}
	 * labeled alternative in {@link PlPgSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(PlPgSQLParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varRef}
	 * labeled alternative in {@link PlPgSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarRef(PlPgSQLParser.VarRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varRef}
	 * labeled alternative in {@link PlPgSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarRef(PlPgSQLParser.VarRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal}
	 * labeled alternative in {@link PlPgSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PlPgSQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link PlPgSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PlPgSQLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link PlPgSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(PlPgSQLParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link PlPgSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(PlPgSQLParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(PlPgSQLParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(PlPgSQLParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(PlPgSQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(PlPgSQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSQLParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(PlPgSQLParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSQLParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(PlPgSQLParser.FunctionNameContext ctx);
}