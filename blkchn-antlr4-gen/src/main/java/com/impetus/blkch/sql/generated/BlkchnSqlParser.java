// Generated from BlkchnSql.g4 by ANTLR 4.5
package com.impetus.blkch.sql.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BlkchnSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		SELECT=10, FROM=11, ADD=12, AS=13, ALL=14, DISTINCT=15, WHERE=16, GROUP=17, 
		BY=18, GROUPING=19, SETS=20, CUBE=21, ROLLUP=22, ORDER=23, HAVING=24, 
		LIMIT=25, AT=26, OR=27, AND=28, IN=29, NOT=30, NO=31, EXISTS=32, BETWEEN=33, 
		LIKE=34, RLIKE=35, IS=36, NULL=37, TRUE=38, FALSE=39, NULLS=40, ASC=41, 
		DESC=42, HEX=43, FOR=44, INTERVAL=45, CASE=46, WHEN=47, THEN=48, ELSE=49, 
		END=50, JOIN=51, CROSS=52, OUTER=53, INNER=54, LEFT=55, SEMI=56, RIGHT=57, 
		FULL=58, NATURAL=59, ON=60, FIRST=61, AFTER=62, LAST=63, VALUES=64, CREATE=65, 
		TABLE=66, VIEW=67, REPLACE=68, INSERT=69, DELETE=70, INTO=71, DESCRIBE=72, 
		EXPLAIN=73, CAST=74, SHOW=75, TABLES=76, COLUMNS=77, COLUMN=78, USE=79, 
		FUNCTIONS=80, DROP=81, UNION=82, EXCEPT=83, SETMINUS=84, INTERSECT=85, 
		TO=86, ALTER=87, RENAME=88, ARRAY=89, MAP=90, STRUCT=91, COMMENT=92, SET=93, 
		RESET=94, COMMIT=95, ROLLBACK=96, IGNORE=97, CALL=98, WITH=99, VERSION=100, 
		ENDORSEMENT=101, POLICY=102, FILE=103, ARGS=104, ASSET=105, CHAINCODE=106, 
		SMARTCONTRACT=107, STORAGE=108, TYPE=109, JSON=110, CSV=111, FIELDS=112, 
		RECORDS=113, DELIMITED=114, UPGRADE=115, ADDRESS=116, WITHASYNC=117, DEPLOY=118, 
		IF=119, EQ=120, NSEQ=121, NEQ=122, NEQJ=123, LT=124, LTE=125, GT=126, 
		GTE=127, PLUS=128, MINUS=129, ASTERISK=130, SLASH=131, PERCENT=132, DIV=133, 
		TILDE=134, AMPERSAND=135, PIPE=136, HAT=137, PERCENTLIT=138, OUT=139, 
		OF=140, FUNCTION=141, DATABASE=142, DATABASES=143, TRUNCATE=144, ANALYZE=145, 
		COMPUTE=146, LIST=147, REVOKE=148, GRANT=149, EXPORT=150, IMPORT=151, 
		LOAD=152, ROLE=153, ROLES=154, INDEX=155, INDEXES=156, CURRENT_DATE=157, 
		CURRENT_TIMESTAMP=158, STRING=159, BIGINT_LITERAL=160, SMALLINT_LITERAL=161, 
		TINYINT_LITERAL=162, BYTELENGTH_LITERAL=163, INTEGER_VALUE=164, DECIMAL_VALUE=165, 
		DOUBLE_LITERAL=166, BIGDECIMAL_LITERAL=167, IDENTIFIER=168, BACKQUOTED_IDENTIFIER=169, 
		SIMPLE_COMMENT=170, BRACKETED_EMPTY_COMMENT=171, BRACKETED_COMMENT=172, 
		WS=173, UNRECOGNIZED=174, DELIMITER=175;
	public static final int
		RULE_singleStatement = 0, RULE_statement = 1, RULE_insertInto = 2, RULE_columnNames = 3, 
		RULE_columnValues = 4, RULE_constantSeq = 5, RULE_createFunction = 6, 
		RULE_upgradeFunction = 7, RULE_createAsset = 8, RULE_deploySmartContract = 9, 
		RULE_asset = 10, RULE_storageType = 11, RULE_fieldDelimiter = 12, RULE_recordDelimiter = 13, 
		RULE_deleteFunction = 14, RULE_dropAsset = 15, RULE_className = 16, RULE_version = 17, 
		RULE_endorsersFile = 18, RULE_policyFile = 19, RULE_args = 20, RULE_argParamSeq = 21, 
		RULE_argParam = 22, RULE_collection = 23, RULE_bytes = 24, RULE_list = 25, 
		RULE_listTypeDec = 26, RULE_listType = 27, RULE_callFunction = 28, RULE_smartFunction = 29, 
		RULE_assetFunction = 30, RULE_checkIsValid = 31, RULE_classOption = 32, 
		RULE_addressOption = 33, RULE_addressVlaue = 34, RULE_asyncOption = 35, 
		RULE_parameterValues = 36, RULE_query = 37, RULE_queryOrganization = 38, 
		RULE_orderByClause = 39, RULE_limitClause = 40, RULE_queryTerm = 41, RULE_queryPrimary = 42, 
		RULE_sortItem = 43, RULE_querySpecification = 44, RULE_selectClause = 45, 
		RULE_whereClause = 46, RULE_havingClause = 47, RULE_fromClause = 48, RULE_groupByClause = 49, 
		RULE_setQuantifier = 50, RULE_relation = 51, RULE_joinRelation = 52, RULE_joinType = 53, 
		RULE_joinCriteria = 54, RULE_identifierList = 55, RULE_identifierSeq = 56, 
		RULE_relationPrimary = 57, RULE_inlineTable = 58, RULE_tableIdentifier = 59, 
		RULE_namedExpression = 60, RULE_namedExpressionSeq = 61, RULE_expression = 62, 
		RULE_booleanExpression = 63, RULE_predicated = 64, RULE_predicate = 65, 
		RULE_valueExpression = 66, RULE_primaryExpression = 67, RULE_constant = 68, 
		RULE_comparisonOperator = 69, RULE_arithmeticOperator = 70, RULE_predicateOperator = 71, 
		RULE_booleanValue = 72, RULE_interval = 73, RULE_intervalField = 74, RULE_intervalValue = 75, 
		RULE_dataType = 76, RULE_colTypeList = 77, RULE_colType = 78, RULE_complexColTypeList = 79, 
		RULE_complexColType = 80, RULE_whenClause = 81, RULE_qualifiedName = 82, 
		RULE_identifier = 83, RULE_strictIdentifier = 84, RULE_quotedIdentifier = 85, 
		RULE_number = 86, RULE_nonReserved = 87;
	public static final String[] ruleNames = {
		"singleStatement", "statement", "insertInto", "columnNames", "columnValues", 
		"constantSeq", "createFunction", "upgradeFunction", "createAsset", "deploySmartContract", 
		"asset", "storageType", "fieldDelimiter", "recordDelimiter", "deleteFunction", 
		"dropAsset", "className", "version", "endorsersFile", "policyFile", "args", 
		"argParamSeq", "argParam", "collection", "bytes", "list", "listTypeDec", 
		"listType", "callFunction", "smartFunction", "assetFunction", "checkIsValid", 
		"classOption", "addressOption", "addressVlaue", "asyncOption", "parameterValues", 
		"query", "queryOrganization", "orderByClause", "limitClause", "queryTerm", 
		"queryPrimary", "sortItem", "querySpecification", "selectClause", "whereClause", 
		"havingClause", "fromClause", "groupByClause", "setQuantifier", "relation", 
		"joinRelation", "joinType", "joinCriteria", "identifierList", "identifierSeq", 
		"relationPrimary", "inlineTable", "tableIdentifier", "namedExpression", 
		"namedExpressionSeq", "expression", "booleanExpression", "predicated", 
		"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
		"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
		"intervalField", "intervalValue", "dataType", "colTypeList", "colType", 
		"complexColTypeList", "complexColType", "whenClause", "qualifiedName", 
		"identifier", "strictIdentifier", "quotedIdentifier", "number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'HEX('", "'['", "']'", "'IS_VALID'", "'.'", 
		"':'", "'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", "'DISTINCT'", "'WHERE'", 
		"'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", 
		"'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, "'NO'", 
		"'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", "'FALSE'", 
		"'NULLS'", "'ASC'", "'DESC'", "'HEX'", "'FOR'", "'INTERVAL'", "'CASE'", 
		"'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'", 
		"'INNER'", "'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", 
		"'FIRST'", "'AFTER'", "'LAST'", "'VALUES'", "'CREATE'", "'TABLE'", "'VIEW'", 
		"'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", "'DESCRIBE'", "'EXPLAIN'", 
		"'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", "'COLUMN'", "'USE'", "'FUNCTIONS'", 
		"'DROP'", "'UNION'", "'EXCEPT'", "'MINUS'", "'INTERSECT'", "'TO'", "'ALTER'", 
		"'RENAME'", "'ARRAY'", "'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", 
		"'COMMIT'", "'ROLLBACK'", "'IGNORE'", "'CALL'", "'WITH'", "'VERSION'", 
		"'ENDORSEMENT'", "'POLICY'", "'FILE'", "'ARGS'", "'ASSET'", "'CHAINCODE'", 
		"'SMARTCONTRACT'", "'STORAGE'", "'TYPE'", "'JSON'", "'CSV'", "'FIELDS'", 
		"'RECORDS'", "'DELIMITED'", "'UPGRADE'", "'ADDRESS'", "'WITHASYNC'", "'DEPLOY'", 
		"'IF'", null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", "'^'", "'PERCENT'", 
		"'OUT'", "'OF'", "'FUNCTION'", null, null, "'TRUNCATE'", "'ANALYZE'", 
		"'COMPUTE'", "'LIST'", "'REVOKE'", "'GRANT'", "'EXPORT'", "'IMPORT'", 
		"'LOAD'", "'ROLE'", "'ROLES'", "'INDEX'", "'INDEXES'", "'CURRENT_DATE'", 
		"'CURRENT_TIMESTAMP'", null, null, null, null, null, null, null, null, 
		null, null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "SELECT", 
		"FROM", "ADD", "AS", "ALL", "DISTINCT", "WHERE", "GROUP", "BY", "GROUPING", 
		"SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", "OR", "AND", 
		"IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", "IS", "NULL", 
		"TRUE", "FALSE", "NULLS", "ASC", "DESC", "HEX", "FOR", "INTERVAL", "CASE", 
		"WHEN", "THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", 
		"SEMI", "RIGHT", "FULL", "NATURAL", "ON", "FIRST", "AFTER", "LAST", "VALUES", 
		"CREATE", "TABLE", "VIEW", "REPLACE", "INSERT", "DELETE", "INTO", "DESCRIBE", 
		"EXPLAIN", "CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", "FUNCTIONS", 
		"DROP", "UNION", "EXCEPT", "SETMINUS", "INTERSECT", "TO", "ALTER", "RENAME", 
		"ARRAY", "MAP", "STRUCT", "COMMENT", "SET", "RESET", "COMMIT", "ROLLBACK", 
		"IGNORE", "CALL", "WITH", "VERSION", "ENDORSEMENT", "POLICY", "FILE", 
		"ARGS", "ASSET", "CHAINCODE", "SMARTCONTRACT", "STORAGE", "TYPE", "JSON", 
		"CSV", "FIELDS", "RECORDS", "DELIMITED", "UPGRADE", "ADDRESS", "WITHASYNC", 
		"DEPLOY", "IF", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", 
		"PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", 
		"PIPE", "HAT", "PERCENTLIT", "OUT", "OF", "FUNCTION", "DATABASE", "DATABASES", 
		"TRUNCATE", "ANALYZE", "COMPUTE", "LIST", "REVOKE", "GRANT", "EXPORT", 
		"IMPORT", "LOAD", "ROLE", "ROLES", "INDEX", "INDEXES", "CURRENT_DATE", 
		"CURRENT_TIMESTAMP", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", 
		"BYTELENGTH_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", 
		"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
		"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED", 
		"DELIMITER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BlkchnSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is folllowed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public BlkchnSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BlkchnSqlParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			statement();
			setState(177);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateAssetRuleContext extends StatementContext {
		public CreateAssetContext createAsset() {
			return getRuleContext(CreateAssetContext.class,0);
		}
		public CreateAssetRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateAssetRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateAssetRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateAssetRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropAssetRuleContext extends StatementContext {
		public DropAssetContext dropAsset() {
			return getRuleContext(DropAssetContext.class,0);
		}
		public DropAssetRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDropAssetRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDropAssetRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDropAssetRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeploySmartContractRuleContext extends StatementContext {
		public DeploySmartContractContext deploySmartContract() {
			return getRuleContext(DeploySmartContractContext.class,0);
		}
		public DeploySmartContractRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDeploySmartContractRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDeploySmartContractRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDeploySmartContractRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionRuleContext extends StatementContext {
		public CreateFunctionContext createFunction() {
			return getRuleContext(CreateFunctionContext.class,0);
		}
		public CreateFunctionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateFunctionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateFunctionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleInsertContext extends StatementContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSingleInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSingleInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSingleInsert(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallFunctionRuleContext extends StatementContext {
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public CallFunctionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCallFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCallFunctionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCallFunctionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpgradeFunctionRuleContext extends StatementContext {
		public UpgradeFunctionContext upgradeFunction() {
			return getRuleContext(UpgradeFunctionContext.class,0);
		}
		public UpgradeFunctionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterUpgradeFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitUpgradeFunctionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitUpgradeFunctionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteFunctionRuleContext extends StatementContext {
		public DeleteFunctionContext deleteFunction() {
			return getRuleContext(DeleteFunctionContext.class,0);
		}
		public DeleteFunctionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDeleteFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDeleteFunctionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDeleteFunctionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				query();
				}
				break;
			case 2:
				_localctx = new SingleInsertContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				insertInto();
				}
				break;
			case 3:
				_localctx = new CreateFunctionRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				createFunction();
				}
				break;
			case 4:
				_localctx = new CallFunctionRuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				callFunction();
				}
				break;
			case 5:
				_localctx = new CreateAssetRuleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				createAsset();
				}
				break;
			case 6:
				_localctx = new DeleteFunctionRuleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				deleteFunction();
				}
				break;
			case 7:
				_localctx = new DropAssetRuleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				dropAsset();
				}
				break;
			case 8:
				_localctx = new UpgradeFunctionRuleContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				upgradeFunction();
				}
				break;
			case 9:
				_localctx = new DeploySmartContractRuleContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(187);
				deploySmartContract();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(BlkchnSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(BlkchnSqlParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(BlkchnSqlParser.VALUES, 0); }
		public ColumnValuesContext columnValues() {
			return getRuleContext(ColumnValuesContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertInto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(INSERT);
			setState(191);
			match(INTO);
			setState(192);
			tableIdentifier();
			setState(197);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(193);
				match(T__0);
				setState(194);
				columnNames();
				setState(195);
				match(T__1);
				}
			}

			setState(199);
			match(VALUES);
			setState(200);
			match(T__0);
			setState(201);
			columnValues();
			setState(202);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNamesContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColumnNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColumnNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columnNames);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			identifierSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnValuesContext extends ParserRuleContext {
		public ConstantSeqContext constantSeq() {
			return getRuleContext(ConstantSeqContext.class,0);
		}
		public ColumnValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColumnValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColumnValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColumnValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnValuesContext columnValues() throws RecognitionException {
		ColumnValuesContext _localctx = new ColumnValuesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_columnValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			constantSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantSeqContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterConstantSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitConstantSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitConstantSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantSeqContext constantSeq() throws RecognitionException {
		ConstantSeqContext _localctx = new ConstantSeqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constantSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			constant();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(209);
				match(T__2);
				setState(210);
				constant();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFunctionContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BlkchnSqlParser.CREATE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(BlkchnSqlParser.FUNCTION, 0); }
		public TerminalNode CHAINCODE() { return getToken(BlkchnSqlParser.CHAINCODE, 0); }
		public TerminalNode SMARTCONTRACT() { return getToken(BlkchnSqlParser.SMARTCONTRACT, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public EndorsersFileContext endorsersFile() {
			return getRuleContext(EndorsersFileContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CreateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFunctionContext createFunction() throws RecognitionException {
		CreateFunctionContext _localctx = new CreateFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(CREATE);
			setState(217);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (CHAINCODE - 106)) | (1L << (SMARTCONTRACT - 106)) | (1L << (FUNCTION - 106)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(218);
			qualifiedName();
			setState(219);
			match(AS);
			setState(220);
			className();
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(221);
				version();
				}
				break;
			}
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(224);
				endorsersFile();
				}
				break;
			}
			setState(228);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(227);
				args();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpgradeFunctionContext extends ParserRuleContext {
		public TerminalNode UPGRADE() { return getToken(BlkchnSqlParser.UPGRADE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(BlkchnSqlParser.FUNCTION, 0); }
		public TerminalNode CHAINCODE() { return getToken(BlkchnSqlParser.CHAINCODE, 0); }
		public TerminalNode SMARTCONTRACT() { return getToken(BlkchnSqlParser.SMARTCONTRACT, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public EndorsersFileContext endorsersFile() {
			return getRuleContext(EndorsersFileContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public UpgradeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upgradeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterUpgradeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitUpgradeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitUpgradeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpgradeFunctionContext upgradeFunction() throws RecognitionException {
		UpgradeFunctionContext _localctx = new UpgradeFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_upgradeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(UPGRADE);
			setState(231);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (CHAINCODE - 106)) | (1L << (SMARTCONTRACT - 106)) | (1L << (FUNCTION - 106)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(232);
			qualifiedName();
			setState(233);
			match(AS);
			setState(234);
			className();
			setState(236);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(235);
				version();
				}
				break;
			}
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(238);
				endorsersFile();
				}
				break;
			}
			setState(242);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(241);
				args();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateAssetContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BlkchnSqlParser.CREATE, 0); }
		public AssetContext asset() {
			return getRuleContext(AssetContext.class,0);
		}
		public TerminalNode WITH() { return getToken(BlkchnSqlParser.WITH, 0); }
		public TerminalNode STORAGE() { return getToken(BlkchnSqlParser.STORAGE, 0); }
		public TerminalNode TYPE() { return getToken(BlkchnSqlParser.TYPE, 0); }
		public StorageTypeContext storageType() {
			return getRuleContext(StorageTypeContext.class,0);
		}
		public TerminalNode ASSET() { return getToken(BlkchnSqlParser.ASSET, 0); }
		public TerminalNode TABLE() { return getToken(BlkchnSqlParser.TABLE, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public FieldDelimiterContext fieldDelimiter() {
			return getRuleContext(FieldDelimiterContext.class,0);
		}
		public RecordDelimiterContext recordDelimiter() {
			return getRuleContext(RecordDelimiterContext.class,0);
		}
		public CreateAssetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createAsset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateAsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateAsset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateAsset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateAssetContext createAsset() throws RecognitionException {
		CreateAssetContext _localctx = new CreateAssetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createAsset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(CREATE);
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==TABLE || _la==ASSET) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(246);
			asset();
			setState(251);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(247);
				match(T__0);
				setState(248);
				colTypeList();
				setState(249);
				match(T__1);
				}
			}

			setState(253);
			match(WITH);
			setState(254);
			match(STORAGE);
			setState(255);
			match(TYPE);
			setState(256);
			storageType();
			setState(258);
			_la = _input.LA(1);
			if (_la==FIELDS) {
				{
				setState(257);
				fieldDelimiter();
				}
			}

			setState(261);
			_la = _input.LA(1);
			if (_la==RECORDS) {
				{
				setState(260);
				recordDelimiter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeploySmartContractContext extends ParserRuleContext {
		public TerminalNode DEPLOY() { return getToken(BlkchnSqlParser.DEPLOY, 0); }
		public TerminalNode SMARTCONTRACT() { return getToken(BlkchnSqlParser.SMARTCONTRACT, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode WITHASYNC() { return getToken(BlkchnSqlParser.WITHASYNC, 0); }
		public AsyncOptionContext asyncOption() {
			return getRuleContext(AsyncOptionContext.class,0);
		}
		public DeploySmartContractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deploySmartContract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDeploySmartContract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDeploySmartContract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDeploySmartContract(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeploySmartContractContext deploySmartContract() throws RecognitionException {
		DeploySmartContractContext _localctx = new DeploySmartContractContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_deploySmartContract);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(DEPLOY);
			setState(264);
			match(SMARTCONTRACT);
			setState(265);
			className();
			setState(266);
			match(T__0);
			setState(268);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << FIRST) | (1L << AFTER) | (1L << LAST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)) | (1L << (LT - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (MINUS - 129)) | (1L << (DIV - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (OUT - 129)) | (1L << (OF - 129)) | (1L << (FUNCTION - 129)) | (1L << (DATABASE - 129)) | (1L << (DATABASES - 129)) | (1L << (TRUNCATE - 129)) | (1L << (ANALYZE - 129)) | (1L << (COMPUTE - 129)) | (1L << (LIST - 129)) | (1L << (REVOKE - 129)) | (1L << (GRANT - 129)) | (1L << (EXPORT - 129)) | (1L << (IMPORT - 129)) | (1L << (LOAD - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (INDEX - 129)) | (1L << (INDEXES - 129)) | (1L << (CURRENT_DATE - 129)) | (1L << (CURRENT_TIMESTAMP - 129)) | (1L << (STRING - 129)) | (1L << (BIGINT_LITERAL - 129)) | (1L << (SMALLINT_LITERAL - 129)) | (1L << (TINYINT_LITERAL - 129)) | (1L << (INTEGER_VALUE - 129)) | (1L << (DECIMAL_VALUE - 129)) | (1L << (DOUBLE_LITERAL - 129)) | (1L << (BIGDECIMAL_LITERAL - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BACKQUOTED_IDENTIFIER - 129)))) != 0)) {
				{
				setState(267);
				parameterValues();
				}
			}

			setState(270);
			match(T__1);
			setState(274);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(271);
				match(AND);
				setState(272);
				match(WITHASYNC);
				setState(273);
				asyncOption();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssetContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterAsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitAsset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitAsset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssetContext asset() throws RecognitionException {
		AssetContext _localctx = new AssetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_asset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageTypeContext extends ParserRuleContext {
		public TerminalNode JSON() { return getToken(BlkchnSqlParser.JSON, 0); }
		public TerminalNode CSV() { return getToken(BlkchnSqlParser.CSV, 0); }
		public StorageTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterStorageType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitStorageType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitStorageType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageTypeContext storageType() throws RecognitionException {
		StorageTypeContext _localctx = new StorageTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_storageType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(_la==JSON || _la==CSV) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDelimiterContext extends ParserRuleContext {
		public TerminalNode FIELDS() { return getToken(BlkchnSqlParser.FIELDS, 0); }
		public TerminalNode DELIMITED() { return getToken(BlkchnSqlParser.DELIMITED, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public FieldDelimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDelimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterFieldDelimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitFieldDelimiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitFieldDelimiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDelimiterContext fieldDelimiter() throws RecognitionException {
		FieldDelimiterContext _localctx = new FieldDelimiterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fieldDelimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(FIELDS);
			setState(281);
			match(DELIMITED);
			setState(282);
			match(BY);
			setState(283);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordDelimiterContext extends ParserRuleContext {
		public TerminalNode RECORDS() { return getToken(BlkchnSqlParser.RECORDS, 0); }
		public TerminalNode DELIMITED() { return getToken(BlkchnSqlParser.DELIMITED, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public RecordDelimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDelimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterRecordDelimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitRecordDelimiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitRecordDelimiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordDelimiterContext recordDelimiter() throws RecognitionException {
		RecordDelimiterContext _localctx = new RecordDelimiterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_recordDelimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(RECORDS);
			setState(286);
			match(DELIMITED);
			setState(287);
			match(BY);
			setState(288);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteFunctionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(BlkchnSqlParser.DELETE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public DeleteFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDeleteFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDeleteFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDeleteFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteFunctionContext deleteFunction() throws RecognitionException {
		DeleteFunctionContext _localctx = new DeleteFunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_deleteFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(DELETE);
			setState(291);
			qualifiedName();
			setState(292);
			match(T__0);
			setState(294);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << FIRST) | (1L << AFTER) | (1L << LAST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)) | (1L << (LT - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (MINUS - 129)) | (1L << (DIV - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (OUT - 129)) | (1L << (OF - 129)) | (1L << (FUNCTION - 129)) | (1L << (DATABASE - 129)) | (1L << (DATABASES - 129)) | (1L << (TRUNCATE - 129)) | (1L << (ANALYZE - 129)) | (1L << (COMPUTE - 129)) | (1L << (LIST - 129)) | (1L << (REVOKE - 129)) | (1L << (GRANT - 129)) | (1L << (EXPORT - 129)) | (1L << (IMPORT - 129)) | (1L << (LOAD - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (INDEX - 129)) | (1L << (INDEXES - 129)) | (1L << (CURRENT_DATE - 129)) | (1L << (CURRENT_TIMESTAMP - 129)) | (1L << (STRING - 129)) | (1L << (BIGINT_LITERAL - 129)) | (1L << (SMALLINT_LITERAL - 129)) | (1L << (TINYINT_LITERAL - 129)) | (1L << (INTEGER_VALUE - 129)) | (1L << (DECIMAL_VALUE - 129)) | (1L << (DOUBLE_LITERAL - 129)) | (1L << (BIGDECIMAL_LITERAL - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BACKQUOTED_IDENTIFIER - 129)))) != 0)) {
				{
				setState(293);
				parameterValues();
				}
			}

			setState(296);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropAssetContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(BlkchnSqlParser.DROP, 0); }
		public AssetContext asset() {
			return getRuleContext(AssetContext.class,0);
		}
		public TerminalNode ASSET() { return getToken(BlkchnSqlParser.ASSET, 0); }
		public TerminalNode TABLE() { return getToken(BlkchnSqlParser.TABLE, 0); }
		public DropAssetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropAsset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDropAsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDropAsset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDropAsset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropAssetContext dropAsset() throws RecognitionException {
		DropAssetContext _localctx = new DropAssetContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dropAsset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(DROP);
			setState(299);
			_la = _input.LA(1);
			if ( !(_la==TABLE || _la==ASSET) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(300);
			asset();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(BlkchnSqlParser.WITH, 0); }
		public TerminalNode VERSION() { return getToken(BlkchnSqlParser.VERSION, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(WITH);
			setState(305);
			match(VERSION);
			setState(306);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndorsersFileContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(BlkchnSqlParser.WITH, 0); }
		public TerminalNode ENDORSEMENT() { return getToken(BlkchnSqlParser.ENDORSEMENT, 0); }
		public TerminalNode POLICY() { return getToken(BlkchnSqlParser.POLICY, 0); }
		public TerminalNode FILE() { return getToken(BlkchnSqlParser.FILE, 0); }
		public PolicyFileContext policyFile() {
			return getRuleContext(PolicyFileContext.class,0);
		}
		public EndorsersFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endorsersFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterEndorsersFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitEndorsersFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitEndorsersFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndorsersFileContext endorsersFile() throws RecognitionException {
		EndorsersFileContext _localctx = new EndorsersFileContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_endorsersFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(WITH);
			setState(309);
			match(ENDORSEMENT);
			setState(310);
			match(POLICY);
			setState(311);
			match(FILE);
			setState(312);
			policyFile();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PolicyFileContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public PolicyFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_policyFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterPolicyFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitPolicyFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitPolicyFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolicyFileContext policyFile() throws RecognitionException {
		PolicyFileContext _localctx = new PolicyFileContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_policyFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(BlkchnSqlParser.WITH, 0); }
		public TerminalNode ARGS() { return getToken(BlkchnSqlParser.ARGS, 0); }
		public ArgParamSeqContext argParamSeq() {
			return getRuleContext(ArgParamSeqContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(WITH);
			setState(317);
			match(ARGS);
			setState(318);
			argParamSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgParamSeqContext extends ParserRuleContext {
		public List<ArgParamContext> argParam() {
			return getRuleContexts(ArgParamContext.class);
		}
		public ArgParamContext argParam(int i) {
			return getRuleContext(ArgParamContext.class,i);
		}
		public ArgParamSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argParamSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArgParamSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArgParamSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArgParamSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgParamSeqContext argParamSeq() throws RecognitionException {
		ArgParamSeqContext _localctx = new ArgParamSeqContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_argParamSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			argParam();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(321);
				match(T__2);
				setState(322);
				argParam();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgParamContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public ArgParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArgParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArgParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArgParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgParamContext argParam() throws RecognitionException {
		ArgParamContext _localctx = new ArgParamContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argParam);
		try {
			setState(330);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case FIRST:
			case AFTER:
			case LAST:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case COMMIT:
			case ROLLBACK:
			case IGNORE:
			case IF:
			case MINUS:
			case DIV:
			case PERCENTLIT:
			case OUT:
			case OF:
			case FUNCTION:
			case DATABASE:
			case DATABASES:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case REVOKE:
			case GRANT:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case INDEX:
			case INDEXES:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case STRING:
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_LITERAL:
			case BIGDECIMAL_LITERAL:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				constant();
				}
				break;
			case T__3:
			case T__4:
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				collection();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCollection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCollection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_collection);
		try {
			setState(334);
			switch (_input.LA(1)) {
			case T__4:
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				list();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				bytes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BytesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public BytesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bytes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BytesContext bytes() throws RecognitionException {
		BytesContext _localctx = new BytesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__3);
			setState(337);
			match(STRING);
			setState(338);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public ListTypeDecContext listTypeDec() {
			return getRuleContext(ListTypeDecContext.class,0);
		}
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(340);
				listTypeDec();
				}
			}

			setState(343);
			match(T__4);
			setState(345);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << FIRST) | (1L << AFTER) | (1L << LAST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)) | (1L << (LT - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (MINUS - 129)) | (1L << (DIV - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (OUT - 129)) | (1L << (OF - 129)) | (1L << (FUNCTION - 129)) | (1L << (DATABASE - 129)) | (1L << (DATABASES - 129)) | (1L << (TRUNCATE - 129)) | (1L << (ANALYZE - 129)) | (1L << (COMPUTE - 129)) | (1L << (LIST - 129)) | (1L << (REVOKE - 129)) | (1L << (GRANT - 129)) | (1L << (EXPORT - 129)) | (1L << (IMPORT - 129)) | (1L << (LOAD - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (INDEX - 129)) | (1L << (INDEXES - 129)) | (1L << (CURRENT_DATE - 129)) | (1L << (CURRENT_TIMESTAMP - 129)) | (1L << (STRING - 129)) | (1L << (BIGINT_LITERAL - 129)) | (1L << (SMALLINT_LITERAL - 129)) | (1L << (TINYINT_LITERAL - 129)) | (1L << (INTEGER_VALUE - 129)) | (1L << (DECIMAL_VALUE - 129)) | (1L << (DOUBLE_LITERAL - 129)) | (1L << (BIGDECIMAL_LITERAL - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BACKQUOTED_IDENTIFIER - 129)))) != 0)) {
				{
				setState(344);
				parameterValues();
				}
			}

			setState(347);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListTypeDecContext extends ParserRuleContext {
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public ListTypeDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listTypeDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterListTypeDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitListTypeDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitListTypeDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeDecContext listTypeDec() throws RecognitionException {
		ListTypeDecContext _localctx = new ListTypeDecContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listTypeDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(LT);
			setState(350);
			listType();
			setState(351);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListTypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallFunctionContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(BlkchnSqlParser.CALL, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SmartFunctionContext smartFunction() {
			return getRuleContext(SmartFunctionContext.class,0);
		}
		public AssetFunctionContext assetFunction() {
			return getRuleContext(AssetFunctionContext.class,0);
		}
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(CALL);
			setState(356);
			qualifiedName();
			setState(357);
			match(T__0);
			setState(359);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << FIRST) | (1L << AFTER) | (1L << LAST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)) | (1L << (LT - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (MINUS - 129)) | (1L << (DIV - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (OUT - 129)) | (1L << (OF - 129)) | (1L << (FUNCTION - 129)) | (1L << (DATABASE - 129)) | (1L << (DATABASES - 129)) | (1L << (TRUNCATE - 129)) | (1L << (ANALYZE - 129)) | (1L << (COMPUTE - 129)) | (1L << (LIST - 129)) | (1L << (REVOKE - 129)) | (1L << (GRANT - 129)) | (1L << (EXPORT - 129)) | (1L << (IMPORT - 129)) | (1L << (LOAD - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (INDEX - 129)) | (1L << (INDEXES - 129)) | (1L << (CURRENT_DATE - 129)) | (1L << (CURRENT_TIMESTAMP - 129)) | (1L << (STRING - 129)) | (1L << (BIGINT_LITERAL - 129)) | (1L << (SMALLINT_LITERAL - 129)) | (1L << (TINYINT_LITERAL - 129)) | (1L << (INTEGER_VALUE - 129)) | (1L << (DECIMAL_VALUE - 129)) | (1L << (DOUBLE_LITERAL - 129)) | (1L << (BIGDECIMAL_LITERAL - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (BACKQUOTED_IDENTIFIER - 129)))) != 0)) {
				{
				setState(358);
				parameterValues();
				}
			}

			setState(361);
			match(T__1);
			setState(364);
			switch (_input.LA(1)) {
			case USE:
				{
				setState(362);
				smartFunction();
				}
				break;
			case EOF:
			case AS:
				{
				setState(363);
				assetFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SmartFunctionContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(BlkchnSqlParser.USE, 0); }
		public ClassOptionContext classOption() {
			return getRuleContext(ClassOptionContext.class,0);
		}
		public TerminalNode WITH() { return getToken(BlkchnSqlParser.WITH, 0); }
		public AddressOptionContext addressOption() {
			return getRuleContext(AddressOptionContext.class,0);
		}
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode WITHASYNC() { return getToken(BlkchnSqlParser.WITHASYNC, 0); }
		public AsyncOptionContext asyncOption() {
			return getRuleContext(AsyncOptionContext.class,0);
		}
		public CheckIsValidContext checkIsValid() {
			return getRuleContext(CheckIsValidContext.class,0);
		}
		public SmartFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smartFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSmartFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSmartFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSmartFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmartFunctionContext smartFunction() throws RecognitionException {
		SmartFunctionContext _localctx = new SmartFunctionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_smartFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(USE);
			setState(367);
			classOption();
			setState(368);
			match(WITH);
			setState(369);
			addressOption();
			setState(373);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(370);
				match(AND);
				setState(371);
				match(WITHASYNC);
				setState(372);
				asyncOption();
				}
			}

			setState(376);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(375);
				checkIsValid();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssetFunctionContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public AssetContext asset() {
			return getRuleContext(AssetContext.class,0);
		}
		public TerminalNode ASSET() { return getToken(BlkchnSqlParser.ASSET, 0); }
		public TerminalNode TABLE() { return getToken(BlkchnSqlParser.TABLE, 0); }
		public AssetFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assetFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterAssetFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitAssetFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitAssetFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssetFunctionContext assetFunction() throws RecognitionException {
		AssetFunctionContext _localctx = new AssetFunctionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assetFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(378);
				match(AS);
				setState(379);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==ASSET) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(380);
				asset();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckIsValidContext extends ParserRuleContext {
		public CheckIsValidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkIsValid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCheckIsValid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCheckIsValid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCheckIsValid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckIsValidContext checkIsValid() throws RecognitionException {
		CheckIsValidContext _localctx = new CheckIsValidContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_checkIsValid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOptionContext extends ParserRuleContext {
		public TerminalNode SMARTCONTRACT() { return getToken(BlkchnSqlParser.SMARTCONTRACT, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterClassOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitClassOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitClassOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOptionContext classOption() throws RecognitionException {
		ClassOptionContext _localctx = new ClassOptionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(SMARTCONTRACT);
			setState(386);
			className();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddressOptionContext extends ParserRuleContext {
		public TerminalNode ADDRESS() { return getToken(BlkchnSqlParser.ADDRESS, 0); }
		public AddressVlaueContext addressVlaue() {
			return getRuleContext(AddressVlaueContext.class,0);
		}
		public AddressOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addressOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterAddressOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitAddressOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitAddressOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressOptionContext addressOption() throws RecognitionException {
		AddressOptionContext _localctx = new AddressOptionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_addressOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(ADDRESS);
			setState(389);
			addressVlaue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddressVlaueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public AddressVlaueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addressVlaue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterAddressVlaue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitAddressVlaue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitAddressVlaue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressVlaueContext addressVlaue() throws RecognitionException {
		AddressVlaueContext _localctx = new AddressVlaueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_addressVlaue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsyncOptionContext extends ParserRuleContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public AsyncOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asyncOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterAsyncOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitAsyncOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitAsyncOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsyncOptionContext asyncOption() throws RecognitionException {
		AsyncOptionContext _localctx = new AsyncOptionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_asyncOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			booleanValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterValuesContext extends ParserRuleContext {
		public ArgParamSeqContext argParamSeq() {
			return getRuleContext(ArgParamSeqContext.class,0);
		}
		public ParameterValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterParameterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitParameterValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitParameterValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterValuesContext parameterValues() throws RecognitionException {
		ParameterValuesContext _localctx = new ParameterValuesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parameterValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			argParamSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	 
		public QueryContext() { }
		public void copyFrom(QueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleQueryContext extends QueryContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SimpleQueryContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSimpleQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSimpleQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSimpleQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_query);
		try {
			_localctx = new SimpleQueryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			queryTerm(0);
			setState(398);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(400);
				orderByClause();
				}
			}

			setState(404);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(403);
				limitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public TerminalNode ORDER() { return getToken(BlkchnSqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(ORDER);
			setState(407);
			match(BY);
			setState(408);
			((OrderByClauseContext)_localctx).sortItem = sortItem();
			((OrderByClauseContext)_localctx).order.add(((OrderByClauseContext)_localctx).sortItem);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(409);
				match(T__2);
				setState(410);
				((OrderByClauseContext)_localctx).sortItem = sortItem();
				((OrderByClauseContext)_localctx).order.add(((OrderByClauseContext)_localctx).sortItem);
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public ExpressionContext limit;
		public TerminalNode LIMIT() { return getToken(BlkchnSqlParser.LIMIT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(416);
			match(LIMIT);
			setState(417);
			((LimitClauseContext)_localctx).limit = expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(BlkchnSqlParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(BlkchnSqlParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(BlkchnSqlParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(BlkchnSqlParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(420);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(422);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(423);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (UNION - 82)) | (1L << (EXCEPT - 82)) | (1L << (SETMINUS - 82)) | (1L << (INTERSECT - 82)))) != 0)) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(425);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(424);
						setQuantifier();
						}
					}

					setState(427);
					((SetOperationContext)_localctx).right = queryTerm(2);
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_queryPrimary);
		try {
			setState(438);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				querySpecification();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(T__0);
				setState(435);
				query();
				setState(436);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(BlkchnSqlParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(BlkchnSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(BlkchnSqlParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(BlkchnSqlParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(BlkchnSqlParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			expression();
			setState(442);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(441);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(446);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(444);
				match(NULLS);
				setState(445);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_querySpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			selectClause();
			setState(449);
			fromClause();
			setState(451);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(450);
				whereClause();
				}
				break;
			}
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(453);
				groupByClause();
				}
				break;
			}
			setState(457);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(456);
				havingClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(BlkchnSqlParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(SELECT);
			setState(461);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(460);
				setQuantifier();
				}
				break;
			}
			setState(463);
			namedExpressionSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(BlkchnSqlParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(WHERE);
			setState(466);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(BlkchnSqlParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(HAVING);
			setState(469);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(BlkchnSqlParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(FROM);
			setState(472);
			relation();
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(473);
					match(T__2);
					setState(474);
					relation();
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public TerminalNode GROUP() { return getToken(BlkchnSqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_groupByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(GROUP);
			setState(481);
			match(BY);
			setState(482);
			((GroupByClauseContext)_localctx).expression = expression();
			((GroupByClauseContext)_localctx).groupingExpressions.add(((GroupByClauseContext)_localctx).expression);
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					match(T__2);
					setState(484);
					((GroupByClauseContext)_localctx).expression = expression();
					((GroupByClauseContext)_localctx).groupingExpressions.add(((GroupByClauseContext)_localctx).expression);
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(BlkchnSqlParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(BlkchnSqlParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			relationPrimary();
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(493);
					joinRelation();
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(BlkchnSqlParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_joinRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(499);
			joinType();
			}
			setState(500);
			match(JOIN);
			setState(501);
			((JoinRelationContext)_localctx).right = relationPrimary();
			setState(503);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(502);
				joinCriteria();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(BlkchnSqlParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(BlkchnSqlParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(BlkchnSqlParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(BlkchnSqlParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(BlkchnSqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(BlkchnSqlParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_joinType);
		int _la;
		try {
			setState(521);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(505);
					match(INNER);
					}
				}

				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(CROSS);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(LEFT);
				setState(511);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(510);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(513);
				match(RIGHT);
				setState(515);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(514);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(517);
				match(FULL);
				setState(519);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(518);
					match(OUTER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(BlkchnSqlParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_joinCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(ON);
			setState(524);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(T__0);
			setState(527);
			identifierSeq();
			setState(528);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_identifierSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			identifier();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(531);
				match(T__2);
				setState(532);
				identifier();
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_relationPrimary);
		try {
			setState(564);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				tableIdentifier();
				setState(543);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(540);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(539);
						match(AS);
						}
						break;
					}
					setState(542);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				match(T__0);
				setState(546);
				query();
				setState(547);
				match(T__1);
				setState(552);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(549);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(548);
						match(AS);
						}
						break;
					}
					setState(551);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				inlineTable();
				}
				break;
			case 4:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(555);
				match(T__0);
				setState(556);
				relation();
				setState(557);
				match(T__1);
				setState(562);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(559);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(558);
						match(AS);
						}
						break;
					}
					setState(561);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(BlkchnSqlParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(VALUES);
			setState(567);
			expression();
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(568);
					match(T__2);
					setState(569);
					expression();
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(582);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(576);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(575);
					match(AS);
					}
					break;
				}
				setState(578);
				identifier();
				setState(580);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(579);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(584);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(585);
				match(T__7);
				}
				break;
			}
			setState(589);
			((TableIdentifierContext)_localctx).table = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			expression();
			setState(599);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(593);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(592);
					match(AS);
					}
					break;
				}
				setState(597);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case FIRST:
				case AFTER:
				case LAST:
				case VALUES:
				case CREATE:
				case TABLE:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case COMMIT:
				case ROLLBACK:
				case IGNORE:
				case IF:
				case DIV:
				case PERCENTLIT:
				case OUT:
				case OF:
				case FUNCTION:
				case DATABASE:
				case DATABASES:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case REVOKE:
				case GRANT:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case INDEX:
				case INDEXES:
				case CURRENT_DATE:
				case CURRENT_TIMESTAMP:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(595);
					identifier();
					}
					break;
				case T__0:
					{
					setState(596);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_namedExpressionSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			namedExpression();
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(602);
				match(T__2);
				setState(603);
				namedExpression();
				}
				}
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(BlkchnSqlParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBooleanDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBooleanDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(BlkchnSqlParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(612);
				match(NOT);
				setState(613);
				booleanExpression(4);
				}
				break;
			case 2:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(614);
				predicated();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(623);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(617);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(618);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(619);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(620);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(621);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(622);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			valueExpression(0);
			setState(630);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(629);
				predicate();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(BlkchnSqlParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(BlkchnSqlParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(BlkchnSqlParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(BlkchnSqlParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(BlkchnSqlParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(BlkchnSqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(BlkchnSqlParser.NULL, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_predicate);
		int _la;
		try {
			setState(673);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(632);
					match(NOT);
					}
				}

				setState(635);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(636);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(637);
				match(AND);
				setState(638);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(640);
					match(NOT);
					}
				}

				setState(643);
				((PredicateContext)_localctx).kind = match(IN);
				setState(644);
				match(T__0);
				setState(645);
				expression();
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(646);
					match(T__2);
					setState(647);
					expression();
					}
					}
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(653);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(656);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(655);
					match(NOT);
					}
				}

				setState(658);
				((PredicateContext)_localctx).kind = match(IN);
				setState(659);
				match(T__0);
				setState(660);
				query();
				setState(661);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(664);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(663);
					match(NOT);
					}
				}

				setState(666);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(667);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(668);
				match(IS);
				setState(670);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(669);
					match(NOT);
					}
				}

				setState(672);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(BlkchnSqlParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(BlkchnSqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(BlkchnSqlParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(BlkchnSqlParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(BlkchnSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public TerminalNode AMPERSAND() { return getToken(BlkchnSqlParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(BlkchnSqlParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(BlkchnSqlParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(BlkchnSqlParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(BlkchnSqlParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			switch (_input.LA(1)) {
			case PLUS:
			case TILDE:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(676);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==TILDE) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(677);
				valueExpression(7);
				}
				break;
			case T__0:
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case FIRST:
			case AFTER:
			case LAST:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case COMMIT:
			case ROLLBACK:
			case IGNORE:
			case IF:
			case MINUS:
			case ASTERISK:
			case DIV:
			case PERCENTLIT:
			case OUT:
			case OF:
			case FUNCTION:
			case DATABASE:
			case DATABASES:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case REVOKE:
			case GRANT:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case INDEX:
			case INDEXES:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case STRING:
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_LITERAL:
			case BIGDECIMAL_LITERAL:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(678);
				primaryExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(700);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(681);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(682);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (ASTERISK - 130)) | (1L << (SLASH - 130)) | (1L << (PERCENT - 130)) | (1L << (DIV - 130)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(683);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(684);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(685);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(686);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(687);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(688);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(689);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(690);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(691);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(692);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(693);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(694);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(695);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(696);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(697);
						comparisonOperator();
						setState(698);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(BlkchnSqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(BlkchnSqlParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BlkchnSqlParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(BlkchnSqlParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(BlkchnSqlParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(BlkchnSqlParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(BlkchnSqlParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeFunctionCallContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(BlkchnSqlParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(BlkchnSqlParser.CURRENT_TIMESTAMP, 0); }
		public TimeFunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTimeFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTimeFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTimeFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(BlkchnSqlParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(BlkchnSqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(BlkchnSqlParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BlkchnSqlParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(BlkchnSqlParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(BlkchnSqlParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(BlkchnSqlParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				_localctx = new TimeFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(706);
				((TimeFunctionCallContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((TimeFunctionCallContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(707);
				match(CASE);
				setState(709); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(708);
					whenClause();
					}
					}
					setState(711); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(715);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(713);
					match(ELSE);
					setState(714);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(717);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(719);
				match(CASE);
				setState(720);
				((SimpleCaseContext)_localctx).value = expression();
				setState(722); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(721);
					whenClause();
					}
					}
					setState(724); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(728);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(726);
					match(ELSE);
					setState(727);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(730);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(732);
				match(CAST);
				setState(733);
				match(T__0);
				setState(734);
				expression();
				setState(735);
				match(AS);
				setState(736);
				dataType();
				setState(737);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(739);
				match(FIRST);
				setState(740);
				match(T__0);
				setState(741);
				expression();
				setState(744);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(742);
					match(IGNORE);
					setState(743);
					match(NULLS);
					}
				}

				setState(746);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(748);
				match(LAST);
				setState(749);
				match(T__0);
				setState(750);
				expression();
				setState(753);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(751);
					match(IGNORE);
					setState(752);
					match(NULLS);
					}
				}

				setState(755);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(757);
				constant();
				}
				break;
			case 8:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(758);
				match(ASTERISK);
				}
				break;
			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(759);
				qualifiedName();
				setState(760);
				match(T__7);
				setState(761);
				match(ASTERISK);
				}
				break;
			case 10:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(763);
				match(T__0);
				setState(764);
				namedExpression();
				setState(767); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(765);
					match(T__2);
					setState(766);
					namedExpression();
					}
					}
					setState(769); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(771);
				match(T__1);
				}
				break;
			case 11:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(773);
				match(T__0);
				setState(774);
				query();
				setState(775);
				match(T__1);
				}
				break;
			case 12:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(777);
				qualifiedName();
				setState(778);
				match(T__0);
				setState(790);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << FIRST) | (1L << AFTER) | (1L << LAST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (FUNCTION - 128)) | (1L << (DATABASE - 128)) | (1L << (DATABASES - 128)) | (1L << (TRUNCATE - 128)) | (1L << (ANALYZE - 128)) | (1L << (COMPUTE - 128)) | (1L << (LIST - 128)) | (1L << (REVOKE - 128)) | (1L << (GRANT - 128)) | (1L << (EXPORT - 128)) | (1L << (IMPORT - 128)) | (1L << (LOAD - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (INDEX - 128)) | (1L << (INDEXES - 128)) | (1L << (CURRENT_DATE - 128)) | (1L << (CURRENT_TIMESTAMP - 128)) | (1L << (STRING - 128)) | (1L << (BIGINT_LITERAL - 128)) | (1L << (SMALLINT_LITERAL - 128)) | (1L << (TINYINT_LITERAL - 128)) | (1L << (INTEGER_VALUE - 128)) | (1L << (DECIMAL_VALUE - 128)) | (1L << (DOUBLE_LITERAL - 128)) | (1L << (BIGDECIMAL_LITERAL - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (BACKQUOTED_IDENTIFIER - 128)))) != 0)) {
					{
					setState(780);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(779);
						setQuantifier();
						}
						break;
					}
					setState(782);
					namedExpression();
					setState(787);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(783);
						match(T__2);
						setState(784);
						namedExpression();
						}
						}
						setState(789);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(792);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(794);
				identifier();
				}
				break;
			case 14:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(795);
				match(T__0);
				setState(796);
				expression();
				setState(797);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(811);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(809);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(801);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(802);
						match(T__4);
						setState(803);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(804);
						match(T__5);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(806);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(807);
						match(T__7);
						setState(808);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(813);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(BlkchnSqlParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(BlkchnSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BlkchnSqlParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_constant);
		try {
			int _alt;
			setState(826);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(816);
				identifier();
				setState(817);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(819);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(820);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(822); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(821);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(824); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(BlkchnSqlParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(BlkchnSqlParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(BlkchnSqlParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(BlkchnSqlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(BlkchnSqlParser.LTE, 0); }
		public TerminalNode GT() { return getToken(BlkchnSqlParser.GT, 0); }
		public TerminalNode GTE() { return getToken(BlkchnSqlParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(BlkchnSqlParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (EQ - 120)) | (1L << (NSEQ - 120)) | (1L << (NEQ - 120)) | (1L << (NEQJ - 120)) | (1L << (LT - 120)) | (1L << (LTE - 120)) | (1L << (GT - 120)) | (1L << (GTE - 120)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(BlkchnSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(BlkchnSqlParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(BlkchnSqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(BlkchnSqlParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(BlkchnSqlParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(BlkchnSqlParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(BlkchnSqlParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(BlkchnSqlParser.PIPE, 0); }
		public TerminalNode HAT() { return getToken(BlkchnSqlParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_la = _input.LA(1);
			if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (SLASH - 128)) | (1L << (PERCENT - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (AMPERSAND - 128)) | (1L << (PIPE - 128)) | (1L << (HAT - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(BlkchnSqlParser.OR, 0); }
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode IN() { return getToken(BlkchnSqlParser.IN, 0); }
		public TerminalNode NOT() { return getToken(BlkchnSqlParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(BlkchnSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BlkchnSqlParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(BlkchnSqlParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(INTERVAL);
			setState(840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(837);
					intervalField();
					}
					} 
				}
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(BlkchnSqlParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(844);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(847);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(845);
				match(TO);
				setState(846);
				((IntervalFieldContext)_localctx).to = identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(BlkchnSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(BlkchnSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(BlkchnSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_intervalValue);
		int _la;
		try {
			setState(854);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(849);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(852);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(BlkchnSqlParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(BlkchnSqlParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(BlkchnSqlParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(BlkchnSqlParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(BlkchnSqlParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(BlkchnSqlParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_dataType);
		int _la;
		try {
			setState(890);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(857);
				match(LT);
				setState(858);
				dataType();
				setState(859);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(862);
				match(LT);
				setState(863);
				dataType();
				setState(864);
				match(T__2);
				setState(865);
				dataType();
				setState(866);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(868);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(875);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(869);
					match(LT);
					setState(871);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << FIRST) | (1L << AFTER) | (1L << LAST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (DIV - 133)) | (1L << (PERCENTLIT - 133)) | (1L << (OUT - 133)) | (1L << (OF - 133)) | (1L << (FUNCTION - 133)) | (1L << (DATABASE - 133)) | (1L << (DATABASES - 133)) | (1L << (TRUNCATE - 133)) | (1L << (ANALYZE - 133)) | (1L << (COMPUTE - 133)) | (1L << (LIST - 133)) | (1L << (REVOKE - 133)) | (1L << (GRANT - 133)) | (1L << (EXPORT - 133)) | (1L << (IMPORT - 133)) | (1L << (LOAD - 133)) | (1L << (ROLE - 133)) | (1L << (ROLES - 133)) | (1L << (INDEX - 133)) | (1L << (INDEXES - 133)) | (1L << (CURRENT_DATE - 133)) | (1L << (CURRENT_TIMESTAMP - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (BACKQUOTED_IDENTIFIER - 133)))) != 0)) {
						{
						setState(870);
						complexColTypeList();
						}
					}

					setState(873);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(874);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(877);
				identifier();
				setState(888);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(878);
					match(T__0);
					setState(879);
					match(INTEGER_VALUE);
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(880);
						match(T__2);
						setState(881);
						match(INTEGER_VALUE);
						}
						}
						setState(886);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(887);
					match(T__1);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_colTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			colType();
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(893);
				match(T__2);
				setState(894);
				colType();
				}
				}
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(BlkchnSqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_colType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			identifier();
			setState(901);
			dataType();
			setState(904);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(902);
				match(COMMENT);
				setState(903);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			complexColType();
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(907);
				match(T__2);
				setState(908);
				complexColType();
				}
				}
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(BlkchnSqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			identifier();
			setState(915);
			match(T__8);
			setState(916);
			dataType();
			setState(919);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(917);
				match(COMMENT);
				setState(918);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(BlkchnSqlParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(BlkchnSqlParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(WHEN);
			setState(922);
			((WhenClauseContext)_localctx).condition = expression();
			setState(923);
			match(THEN);
			setState(924);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			identifier();
			setState(931);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(927);
					match(T__7);
					setState(928);
					identifier();
					}
					} 
				}
				setState(933);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode FULL() { return getToken(BlkchnSqlParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(BlkchnSqlParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(BlkchnSqlParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(BlkchnSqlParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(BlkchnSqlParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(BlkchnSqlParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(BlkchnSqlParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(BlkchnSqlParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(BlkchnSqlParser.ON, 0); }
		public TerminalNode UNION() { return getToken(BlkchnSqlParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(BlkchnSqlParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(BlkchnSqlParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(BlkchnSqlParser.SETMINUS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_identifier);
		try {
			setState(948);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case FIRST:
			case AFTER:
			case LAST:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case FUNCTIONS:
			case DROP:
			case TO:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case COMMIT:
			case ROLLBACK:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case OUT:
			case OF:
			case FUNCTION:
			case DATABASE:
			case DATABASES:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case REVOKE:
			case GRANT:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case INDEX:
			case INDEXES:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				strictIdentifier();
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 3);
				{
				setState(936);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 4);
				{
				setState(937);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 5);
				{
				setState(938);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 6);
				{
				setState(939);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(940);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 8);
				{
				setState(941);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 9);
				{
				setState(942);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 10);
				{
				setState(943);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 11);
				{
				setState(944);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 12);
				{
				setState(945);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 13);
				{
				setState(946);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 14);
				{
				setState(947);
				match(SETMINUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(BlkchnSqlParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_strictIdentifier);
		try {
			setState(953);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case FIRST:
			case AFTER:
			case LAST:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case FUNCTIONS:
			case DROP:
			case TO:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case COMMIT:
			case ROLLBACK:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case OUT:
			case OF:
			case FUNCTION:
			case DATABASE:
			case DATABASES:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case REVOKE:
			case GRANT:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case INDEX:
			case INDEXES:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
				nonReserved();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(BlkchnSqlParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(BlkchnSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(BlkchnSqlParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(BlkchnSqlParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(BlkchnSqlParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(BlkchnSqlParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(BlkchnSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(BlkchnSqlParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_number);
		int _la;
		try {
			setState(985);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(958);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(957);
					match(MINUS);
					}
				}

				setState(960);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(962);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(961);
					match(MINUS);
					}
				}

				setState(964);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(965);
					match(MINUS);
					}
				}

				setState(968);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(970);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(969);
					match(MINUS);
					}
				}

				setState(972);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(974);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(973);
					match(MINUS);
					}
				}

				setState(976);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(978);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(977);
					match(MINUS);
					}
				}

				setState(980);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(982);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(981);
					match(MINUS);
					}
				}

				setState(984);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(BlkchnSqlParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(BlkchnSqlParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(BlkchnSqlParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(BlkchnSqlParser.COLUMN, 0); }
		public TerminalNode FUNCTIONS() { return getToken(BlkchnSqlParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(BlkchnSqlParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(BlkchnSqlParser.ADD, 0); }
		public TerminalNode LAST() { return getToken(BlkchnSqlParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(BlkchnSqlParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(BlkchnSqlParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(BlkchnSqlParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(BlkchnSqlParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(BlkchnSqlParser.STRUCT, 0); }
		public TerminalNode GROUPING() { return getToken(BlkchnSqlParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(BlkchnSqlParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(BlkchnSqlParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(BlkchnSqlParser.EXPLAIN, 0); }
		public TerminalNode USE() { return getToken(BlkchnSqlParser.USE, 0); }
		public List<TerminalNode> TO() { return getTokens(BlkchnSqlParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(BlkchnSqlParser.TO, i);
		}
		public TerminalNode PERCENTLIT() { return getToken(BlkchnSqlParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(BlkchnSqlParser.OUT, 0); }
		public TerminalNode OF() { return getToken(BlkchnSqlParser.OF, 0); }
		public TerminalNode SET() { return getToken(BlkchnSqlParser.SET, 0); }
		public TerminalNode RESET() { return getToken(BlkchnSqlParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(BlkchnSqlParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(BlkchnSqlParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(BlkchnSqlParser.IF, 0); }
		public TerminalNode NO() { return getToken(BlkchnSqlParser.NO, 0); }
		public TerminalNode COMMIT() { return getToken(BlkchnSqlParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(BlkchnSqlParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(BlkchnSqlParser.IGNORE, 0); }
		public TerminalNode TRUNCATE() { return getToken(BlkchnSqlParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(BlkchnSqlParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(BlkchnSqlParser.LIST, 0); }
		public TerminalNode ANALYZE() { return getToken(BlkchnSqlParser.ANALYZE, 0); }
		public TerminalNode REVOKE() { return getToken(BlkchnSqlParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(BlkchnSqlParser.GRANT, 0); }
		public TerminalNode EXPORT() { return getToken(BlkchnSqlParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(BlkchnSqlParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(BlkchnSqlParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(BlkchnSqlParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(BlkchnSqlParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(BlkchnSqlParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(BlkchnSqlParser.ROLES, 0); }
		public TerminalNode INDEX() { return getToken(BlkchnSqlParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(BlkchnSqlParser.INDEXES, 0); }
		public TerminalNode ASC() { return getToken(BlkchnSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(BlkchnSqlParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(BlkchnSqlParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(BlkchnSqlParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(BlkchnSqlParser.SETS, 0); }
		public TerminalNode AT() { return getToken(BlkchnSqlParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(BlkchnSqlParser.NULLS, 0); }
		public TerminalNode ALL() { return getToken(BlkchnSqlParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(BlkchnSqlParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(BlkchnSqlParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(BlkchnSqlParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(BlkchnSqlParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(BlkchnSqlParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(BlkchnSqlParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(BlkchnSqlParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(BlkchnSqlParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(BlkchnSqlParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(BlkchnSqlParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(BlkchnSqlParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(BlkchnSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(BlkchnSqlParser.INTO, 0); }
		public TerminalNode IS() { return getToken(BlkchnSqlParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(BlkchnSqlParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(BlkchnSqlParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(BlkchnSqlParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(BlkchnSqlParser.OUTER, 0); }
		public List<TerminalNode> TABLE() { return getTokens(BlkchnSqlParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(BlkchnSqlParser.TABLE, i);
		}
		public TerminalNode TRUE() { return getToken(BlkchnSqlParser.TRUE, 0); }
		public TerminalNode RLIKE() { return getToken(BlkchnSqlParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode CASE() { return getToken(BlkchnSqlParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(BlkchnSqlParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(BlkchnSqlParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(BlkchnSqlParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(BlkchnSqlParser.ELSE, 0); }
		public TerminalNode END() { return getToken(BlkchnSqlParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(BlkchnSqlParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(BlkchnSqlParser.INTERVAL, 0); }
		public TerminalNode OR() { return getToken(BlkchnSqlParser.OR, 0); }
		public TerminalNode THEN() { return getToken(BlkchnSqlParser.THEN, 0); }
		public TerminalNode WHEN() { return getToken(BlkchnSqlParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(BlkchnSqlParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(BlkchnSqlParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(BlkchnSqlParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(BlkchnSqlParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(BlkchnSqlParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(BlkchnSqlParser.NOT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(BlkchnSqlParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(BlkchnSqlParser.CURRENT_TIMESTAMP, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER) | (1L << FIRST) | (1L << AFTER) | (1L << LAST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (DIV - 133)) | (1L << (PERCENTLIT - 133)) | (1L << (OUT - 133)) | (1L << (OF - 133)) | (1L << (FUNCTION - 133)) | (1L << (DATABASE - 133)) | (1L << (DATABASES - 133)) | (1L << (TRUNCATE - 133)) | (1L << (ANALYZE - 133)) | (1L << (COMPUTE - 133)) | (1L << (LIST - 133)) | (1L << (REVOKE - 133)) | (1L << (GRANT - 133)) | (1L << (EXPORT - 133)) | (1L << (IMPORT - 133)) | (1L << (LOAD - 133)) | (1L << (ROLE - 133)) | (1L << (ROLES - 133)) | (1L << (INDEX - 133)) | (1L << (INDEXES - 133)) | (1L << (CURRENT_DATE - 133)) | (1L << (CURRENT_TIMESTAMP - 133)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 41:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 63:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 66:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 67:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00b1\u03e0\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\u00bf\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c8\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7\u00d6\n\7\f\7\16\7\u00d9"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e1\n\b\3\b\5\b\u00e4\n\b\3\b\5\b"+
		"\u00e7\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ef\n\t\3\t\5\t\u00f2\n\t\3\t"+
		"\5\t\u00f5\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00fe\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0105\n\n\3\n\5\n\u0108\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u010f"+
		"\n\13\3\13\3\13\3\13\3\13\5\13\u0115\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0129"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\7\27\u0146\n\27\f\27\16\27\u0149\13\27\3\30\3\30\5\30\u014d\n\30\3\31"+
		"\3\31\5\31\u0151\n\31\3\32\3\32\3\32\3\32\3\33\5\33\u0158\n\33\3\33\3"+
		"\33\5\33\u015c\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\5\36\u016a\n\36\3\36\3\36\3\36\5\36\u016f\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u0178\n\37\3\37\5\37\u017b\n\37\3 \3 \3 "+
		"\5 \u0180\n \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'"+
		"\3(\5(\u0194\n(\3(\5(\u0197\n(\3)\3)\3)\3)\3)\7)\u019e\n)\f)\16)\u01a1"+
		"\13)\3*\3*\3*\3+\3+\3+\3+\3+\3+\5+\u01ac\n+\3+\7+\u01af\n+\f+\16+\u01b2"+
		"\13+\3,\3,\3,\3,\3,\5,\u01b9\n,\3-\3-\5-\u01bd\n-\3-\3-\5-\u01c1\n-\3"+
		".\3.\3.\5.\u01c6\n.\3.\5.\u01c9\n.\3.\5.\u01cc\n.\3/\3/\5/\u01d0\n/\3"+
		"/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u01de\n\62"+
		"\f\62\16\62\u01e1\13\62\3\63\3\63\3\63\3\63\3\63\7\63\u01e8\n\63\f\63"+
		"\16\63\u01eb\13\63\3\64\3\64\3\65\3\65\7\65\u01f1\n\65\f\65\16\65\u01f4"+
		"\13\65\3\66\3\66\3\66\3\66\5\66\u01fa\n\66\3\67\5\67\u01fd\n\67\3\67\3"+
		"\67\3\67\5\67\u0202\n\67\3\67\3\67\5\67\u0206\n\67\3\67\3\67\5\67\u020a"+
		"\n\67\5\67\u020c\n\67\38\38\38\39\39\39\39\3:\3:\3:\7:\u0218\n:\f:\16"+
		":\u021b\13:\3;\3;\5;\u021f\n;\3;\5;\u0222\n;\3;\3;\3;\3;\5;\u0228\n;\3"+
		";\5;\u022b\n;\3;\3;\3;\3;\3;\5;\u0232\n;\3;\5;\u0235\n;\5;\u0237\n;\3"+
		"<\3<\3<\3<\7<\u023d\n<\f<\16<\u0240\13<\3<\5<\u0243\n<\3<\3<\5<\u0247"+
		"\n<\5<\u0249\n<\3=\3=\3=\5=\u024e\n=\3=\3=\3>\3>\5>\u0254\n>\3>\3>\5>"+
		"\u0258\n>\5>\u025a\n>\3?\3?\3?\7?\u025f\n?\f?\16?\u0262\13?\3@\3@\3A\3"+
		"A\3A\3A\5A\u026a\nA\3A\3A\3A\3A\3A\3A\7A\u0272\nA\fA\16A\u0275\13A\3B"+
		"\3B\5B\u0279\nB\3C\5C\u027c\nC\3C\3C\3C\3C\3C\3C\5C\u0284\nC\3C\3C\3C"+
		"\3C\3C\7C\u028b\nC\fC\16C\u028e\13C\3C\3C\3C\5C\u0293\nC\3C\3C\3C\3C\3"+
		"C\3C\5C\u029b\nC\3C\3C\3C\3C\5C\u02a1\nC\3C\5C\u02a4\nC\3D\3D\3D\3D\5"+
		"D\u02aa\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\7"+
		"D\u02bf\nD\fD\16D\u02c2\13D\3E\3E\3E\3E\6E\u02c8\nE\rE\16E\u02c9\3E\3"+
		"E\5E\u02ce\nE\3E\3E\3E\3E\3E\6E\u02d5\nE\rE\16E\u02d6\3E\3E\5E\u02db\n"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u02eb\nE\3E\3E\3E\3E\3"+
		"E\3E\3E\5E\u02f4\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\6E\u0302\nE\r"+
		"E\16E\u0303\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u030f\nE\3E\3E\3E\7E\u0314\n"+
		"E\fE\16E\u0317\13E\5E\u0319\nE\3E\3E\3E\3E\3E\3E\3E\5E\u0322\nE\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\7E\u032c\nE\fE\16E\u032f\13E\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\6F\u0339\nF\rF\16F\u033a\5F\u033d\nF\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\7"+
		"K\u0349\nK\fK\16K\u034c\13K\3L\3L\3L\3L\5L\u0352\nL\3M\5M\u0355\nM\3M"+
		"\3M\5M\u0359\nM\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u036a"+
		"\nN\3N\3N\5N\u036e\nN\3N\3N\3N\3N\3N\7N\u0375\nN\fN\16N\u0378\13N\3N\5"+
		"N\u037b\nN\5N\u037d\nN\3O\3O\3O\7O\u0382\nO\fO\16O\u0385\13O\3P\3P\3P"+
		"\3P\5P\u038b\nP\3Q\3Q\3Q\7Q\u0390\nQ\fQ\16Q\u0393\13Q\3R\3R\3R\3R\3R\5"+
		"R\u039a\nR\3S\3S\3S\3S\3S\3T\3T\3T\7T\u03a4\nT\fT\16T\u03a7\13T\3U\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u03b7\nU\3V\3V\3V\5V\u03bc\nV"+
		"\3W\3W\3X\5X\u03c1\nX\3X\3X\5X\u03c5\nX\3X\3X\5X\u03c9\nX\3X\3X\5X\u03cd"+
		"\nX\3X\3X\5X\u03d1\nX\3X\3X\5X\u03d5\nX\3X\3X\5X\u03d9\nX\3X\5X\u03dc"+
		"\nX\3Y\3Y\3Y\2\6T\u0080\u0086\u0088Z\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\2\24\4\2lm\u008f\u008f\4\2DDkk\3\2pq\3\2TW\3\2+,\4\2??AA\3\2\20\21\3"+
		"\2$%\4\2\u0082\u0082\u0088\u0088\3\2\u0084\u0087\3\2\u0082\u0083\3\2\u009f"+
		"\u00a0\3\2z\u0081\3\2\u0082\u008b\3\2\35 \3\2()\3\2\u00a6\u00a7\n\2\f"+
		",.\64\67\67?SXcyy\u0087\u0087\u008c\u00a0\u0432\2\u00b2\3\2\2\2\4\u00be"+
		"\3\2\2\2\6\u00c0\3\2\2\2\b\u00ce\3\2\2\2\n\u00d0\3\2\2\2\f\u00d2\3\2\2"+
		"\2\16\u00da\3\2\2\2\20\u00e8\3\2\2\2\22\u00f6\3\2\2\2\24\u0109\3\2\2\2"+
		"\26\u0116\3\2\2\2\30\u0118\3\2\2\2\32\u011a\3\2\2\2\34\u011f\3\2\2\2\36"+
		"\u0124\3\2\2\2 \u012c\3\2\2\2\"\u0130\3\2\2\2$\u0132\3\2\2\2&\u0136\3"+
		"\2\2\2(\u013c\3\2\2\2*\u013e\3\2\2\2,\u0142\3\2\2\2.\u014c\3\2\2\2\60"+
		"\u0150\3\2\2\2\62\u0152\3\2\2\2\64\u0157\3\2\2\2\66\u015f\3\2\2\28\u0163"+
		"\3\2\2\2:\u0165\3\2\2\2<\u0170\3\2\2\2>\u017f\3\2\2\2@\u0181\3\2\2\2B"+
		"\u0183\3\2\2\2D\u0186\3\2\2\2F\u0189\3\2\2\2H\u018b\3\2\2\2J\u018d\3\2"+
		"\2\2L\u018f\3\2\2\2N\u0193\3\2\2\2P\u0198\3\2\2\2R\u01a2\3\2\2\2T\u01a5"+
		"\3\2\2\2V\u01b8\3\2\2\2X\u01ba\3\2\2\2Z\u01c2\3\2\2\2\\\u01cd\3\2\2\2"+
		"^\u01d3\3\2\2\2`\u01d6\3\2\2\2b\u01d9\3\2\2\2d\u01e2\3\2\2\2f\u01ec\3"+
		"\2\2\2h\u01ee\3\2\2\2j\u01f5\3\2\2\2l\u020b\3\2\2\2n\u020d\3\2\2\2p\u0210"+
		"\3\2\2\2r\u0214\3\2\2\2t\u0236\3\2\2\2v\u0238\3\2\2\2x\u024d\3\2\2\2z"+
		"\u0251\3\2\2\2|\u025b\3\2\2\2~\u0263\3\2\2\2\u0080\u0269\3\2\2\2\u0082"+
		"\u0276\3\2\2\2\u0084\u02a3\3\2\2\2\u0086\u02a9\3\2\2\2\u0088\u0321\3\2"+
		"\2\2\u008a\u033c\3\2\2\2\u008c\u033e\3\2\2\2\u008e\u0340\3\2\2\2\u0090"+
		"\u0342\3\2\2\2\u0092\u0344\3\2\2\2\u0094\u0346\3\2\2\2\u0096\u034d\3\2"+
		"\2\2\u0098\u0358\3\2\2\2\u009a\u037c\3\2\2\2\u009c\u037e\3\2\2\2\u009e"+
		"\u0386\3\2\2\2\u00a0\u038c\3\2\2\2\u00a2\u0394\3\2\2\2\u00a4\u039b\3\2"+
		"\2\2\u00a6\u03a0\3\2\2\2\u00a8\u03b6\3\2\2\2\u00aa\u03bb\3\2\2\2\u00ac"+
		"\u03bd\3\2\2\2\u00ae\u03db\3\2\2\2\u00b0\u03dd\3\2\2\2\u00b2\u00b3\5\4"+
		"\3\2\u00b3\u00b4\7\2\2\3\u00b4\3\3\2\2\2\u00b5\u00bf\5L\'\2\u00b6\u00bf"+
		"\5\6\4\2\u00b7\u00bf\5\16\b\2\u00b8\u00bf\5:\36\2\u00b9\u00bf\5\22\n\2"+
		"\u00ba\u00bf\5\36\20\2\u00bb\u00bf\5 \21\2\u00bc\u00bf\5\20\t\2\u00bd"+
		"\u00bf\5\24\13\2\u00be\u00b5\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00b7\3"+
		"\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00be"+
		"\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\5\3\2\2\2"+
		"\u00c0\u00c1\7G\2\2\u00c1\u00c2\7I\2\2\u00c2\u00c7\5x=\2\u00c3\u00c4\7"+
		"\3\2\2\u00c4\u00c5\5\b\5\2\u00c5\u00c6\7\4\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c3\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7B"+
		"\2\2\u00ca\u00cb\7\3\2\2\u00cb\u00cc\5\n\6\2\u00cc\u00cd\7\4\2\2\u00cd"+
		"\7\3\2\2\2\u00ce\u00cf\5r:\2\u00cf\t\3\2\2\2\u00d0\u00d1\5\f\7\2\u00d1"+
		"\13\3\2\2\2\u00d2\u00d7\5\u008aF\2\u00d3\u00d4\7\5\2\2\u00d4\u00d6\5\u008a"+
		"F\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\r\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7C\2\2"+
		"\u00db\u00dc\t\2\2\2\u00dc\u00dd\5\u00a6T\2\u00dd\u00de\7\17\2\2\u00de"+
		"\u00e0\5\"\22\2\u00df\u00e1\5$\23\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e4\5&\24\2\u00e3\u00e2\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e7\5*\26\2\u00e6\u00e5\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\17\3\2\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea"+
		"\t\2\2\2\u00ea\u00eb\5\u00a6T\2\u00eb\u00ec\7\17\2\2\u00ec\u00ee\5\"\22"+
		"\2\u00ed\u00ef\5$\23\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1"+
		"\3\2\2\2\u00f0\u00f2\5&\24\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00f5\5*\26\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\21\3\2\2\2\u00f6\u00f7\7C\2\2\u00f7\u00f8\t\3\2\2\u00f8\u00fd"+
		"\5\26\f\2\u00f9\u00fa\7\3\2\2\u00fa\u00fb\5\u009cO\2\u00fb\u00fc\7\4\2"+
		"\2\u00fc\u00fe\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7n\2\2\u0101\u0102\7o\2\2\u0102"+
		"\u0104\5\30\r\2\u0103\u0105\5\32\16\2\u0104\u0103\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108\5\34\17\2\u0107\u0106\3\2\2\2"+
		"\u0107\u0108\3\2\2\2\u0108\23\3\2\2\2\u0109\u010a\7x\2\2\u010a\u010b\7"+
		"m\2\2\u010b\u010c\5\"\22\2\u010c\u010e\7\3\2\2\u010d\u010f\5J&\2\u010e"+
		"\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0114\7\4"+
		"\2\2\u0111\u0112\7\36\2\2\u0112\u0113\7w\2\2\u0113\u0115\5H%\2\u0114\u0111"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\25\3\2\2\2\u0116\u0117\5\u00a8U\2\u0117"+
		"\27\3\2\2\2\u0118\u0119\t\4\2\2\u0119\31\3\2\2\2\u011a\u011b\7r\2\2\u011b"+
		"\u011c\7t\2\2\u011c\u011d\7\24\2\2\u011d\u011e\7\u00a1\2\2\u011e\33\3"+
		"\2\2\2\u011f\u0120\7s\2\2\u0120\u0121\7t\2\2\u0121\u0122\7\24\2\2\u0122"+
		"\u0123\7\u00a1\2\2\u0123\35\3\2\2\2\u0124\u0125\7H\2\2\u0125\u0126\5\u00a6"+
		"T\2\u0126\u0128\7\3\2\2\u0127\u0129\5J&\2\u0128\u0127\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7\4\2\2\u012b\37\3\2\2\2\u012c"+
		"\u012d\7S\2\2\u012d\u012e\t\3\2\2\u012e\u012f\5\26\f\2\u012f!\3\2\2\2"+
		"\u0130\u0131\7\u00a1\2\2\u0131#\3\2\2\2\u0132\u0133\7e\2\2\u0133\u0134"+
		"\7f\2\2\u0134\u0135\7\u00a1\2\2\u0135%\3\2\2\2\u0136\u0137\7e\2\2\u0137"+
		"\u0138\7g\2\2\u0138\u0139\7h\2\2\u0139\u013a\7i\2\2\u013a\u013b\5(\25"+
		"\2\u013b\'\3\2\2\2\u013c\u013d\7\u00a1\2\2\u013d)\3\2\2\2\u013e\u013f"+
		"\7e\2\2\u013f\u0140\7j\2\2\u0140\u0141\5,\27\2\u0141+\3\2\2\2\u0142\u0147"+
		"\5.\30\2\u0143\u0144\7\5\2\2\u0144\u0146\5.\30\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148-\3\2\2\2"+
		"\u0149\u0147\3\2\2\2\u014a\u014d\5\u008aF\2\u014b\u014d\5\60\31\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d/\3\2\2\2\u014e\u0151\5\64\33"+
		"\2\u014f\u0151\5\62\32\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151"+
		"\61\3\2\2\2\u0152\u0153\7\6\2\2\u0153\u0154\7\u00a1\2\2\u0154\u0155\7"+
		"\4\2\2\u0155\63\3\2\2\2\u0156\u0158\5\66\34\2\u0157\u0156\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\7\7\2\2\u015a\u015c\5J"+
		"&\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015e\7\b\2\2\u015e\65\3\2\2\2\u015f\u0160\7~\2\2\u0160\u0161\58\35\2"+
		"\u0161\u0162\7\u0080\2\2\u0162\67\3\2\2\2\u0163\u0164\7\u00a1\2\2\u0164"+
		"9\3\2\2\2\u0165\u0166\7d\2\2\u0166\u0167\5\u00a6T\2\u0167\u0169\7\3\2"+
		"\2\u0168\u016a\5J&\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u016e\7\4\2\2\u016c\u016f\5<\37\2\u016d\u016f\5> \2\u016e"+
		"\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f;\3\2\2\2\u0170\u0171\7Q\2\2\u0171"+
		"\u0172\5B\"\2\u0172\u0173\7e\2\2\u0173\u0177\5D#\2\u0174\u0175\7\36\2"+
		"\2\u0175\u0176\7w\2\2\u0176\u0178\5H%\2\u0177\u0174\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u017b\5@!\2\u017a\u0179\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b=\3\2\2\2\u017c\u017d\7\17\2\2\u017d\u017e\t\3\2\2"+
		"\u017e\u0180\5\26\f\2\u017f\u017c\3\2\2\2\u017f\u0180\3\2\2\2\u0180?\3"+
		"\2\2\2\u0181\u0182\7\t\2\2\u0182A\3\2\2\2\u0183\u0184\7m\2\2\u0184\u0185"+
		"\5\"\22\2\u0185C\3\2\2\2\u0186\u0187\7v\2\2\u0187\u0188\5F$\2\u0188E\3"+
		"\2\2\2\u0189\u018a\7\u00a1\2\2\u018aG\3\2\2\2\u018b\u018c\5\u0092J\2\u018c"+
		"I\3\2\2\2\u018d\u018e\5,\27\2\u018eK\3\2\2\2\u018f\u0190\5T+\2\u0190\u0191"+
		"\5N(\2\u0191M\3\2\2\2\u0192\u0194\5P)\2\u0193\u0192\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0197\5R*\2\u0196\u0195\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197O\3\2\2\2\u0198\u0199\7\31\2\2\u0199\u019a\7\24\2"+
		"\2\u019a\u019f\5X-\2\u019b\u019c\7\5\2\2\u019c\u019e\5X-\2\u019d\u019b"+
		"\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"Q\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7\33\2\2\u01a3\u01a4\5~@\2\u01a4"+
		"S\3\2\2\2\u01a5\u01a6\b+\1\2\u01a6\u01a7\5V,\2\u01a7\u01b0\3\2\2\2\u01a8"+
		"\u01a9\f\3\2\2\u01a9\u01ab\t\5\2\2\u01aa\u01ac\5f\64\2\u01ab\u01aa\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\5T+\4\u01ae\u01a8"+
		"\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"U\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b9\5Z.\2\u01b4\u01b5\7\3\2\2\u01b5"+
		"\u01b6\5L\'\2\u01b6\u01b7\7\4\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b3\3\2"+
		"\2\2\u01b8\u01b4\3\2\2\2\u01b9W\3\2\2\2\u01ba\u01bc\5~@\2\u01bb\u01bd"+
		"\t\6\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be"+
		"\u01bf\7*\2\2\u01bf\u01c1\t\7\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1Y\3\2\2\2\u01c2\u01c3\5\\/\2\u01c3\u01c5\5b\62\2\u01c4\u01c6"+
		"\5^\60\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7"+
		"\u01c9\5d\63\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2"+
		"\2\2\u01ca\u01cc\5`\61\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"[\3\2\2\2\u01cd\u01cf\7\f\2\2\u01ce\u01d0\5f\64\2\u01cf\u01ce\3\2\2\2"+
		"\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\5|?\2\u01d2]\3\2"+
		"\2\2\u01d3\u01d4\7\22\2\2\u01d4\u01d5\5\u0080A\2\u01d5_\3\2\2\2\u01d6"+
		"\u01d7\7\32\2\2\u01d7\u01d8\5\u0080A\2\u01d8a\3\2\2\2\u01d9\u01da\7\r"+
		"\2\2\u01da\u01df\5h\65\2\u01db\u01dc\7\5\2\2\u01dc\u01de\5h\65\2\u01dd"+
		"\u01db\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0c\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\7\23\2\2\u01e3\u01e4"+
		"\7\24\2\2\u01e4\u01e9\5~@\2\u01e5\u01e6\7\5\2\2\u01e6\u01e8\5~@\2\u01e7"+
		"\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01eae\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\t\b\2\2\u01edg\3\2"+
		"\2\2\u01ee\u01f2\5t;\2\u01ef\u01f1\5j\66\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4"+
		"\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3i\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f5\u01f6\5l\67\2\u01f6\u01f7\7\65\2\2\u01f7\u01f9\5"+
		"t;\2\u01f8\u01fa\5n8\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fak"+
		"\3\2\2\2\u01fb\u01fd\78\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u020c\3\2\2\2\u01fe\u020c\7\66\2\2\u01ff\u0201\79\2\2\u0200\u0202\7\67"+
		"\2\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u020c\3\2\2\2\u0203"+
		"\u0205\7;\2\2\u0204\u0206\7\67\2\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\u020c\3\2\2\2\u0207\u0209\7<\2\2\u0208\u020a\7\67\2\2\u0209"+
		"\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u01fc\3\2"+
		"\2\2\u020b\u01fe\3\2\2\2\u020b\u01ff\3\2\2\2\u020b\u0203\3\2\2\2\u020b"+
		"\u0207\3\2\2\2\u020cm\3\2\2\2\u020d\u020e\7>\2\2\u020e\u020f\5\u0080A"+
		"\2\u020fo\3\2\2\2\u0210\u0211\7\3\2\2\u0211\u0212\5r:\2\u0212\u0213\7"+
		"\4\2\2\u0213q\3\2\2\2\u0214\u0219\5\u00a8U\2\u0215\u0216\7\5\2\2\u0216"+
		"\u0218\5\u00a8U\2\u0217\u0215\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217"+
		"\3\2\2\2\u0219\u021a\3\2\2\2\u021as\3\2\2\2\u021b\u0219\3\2\2\2\u021c"+
		"\u0221\5x=\2\u021d\u021f\7\17\2\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u0220\3\2\2\2\u0220\u0222\5\u00aaV\2\u0221\u021e\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0237\3\2\2\2\u0223\u0224\7\3\2\2\u0224\u0225\5L"+
		"\'\2\u0225\u022a\7\4\2\2\u0226\u0228\7\17\2\2\u0227\u0226\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\5\u00aaV\2\u022a\u0227"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0237\3\2\2\2\u022c\u0237\5v<\2\u022d"+
		"\u022e\7\3\2\2\u022e\u022f\5h\65\2\u022f\u0234\7\4\2\2\u0230\u0232\7\17"+
		"\2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0235\5\u00aaV\2\u0234\u0231\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237"+
		"\3\2\2\2\u0236\u021c\3\2\2\2\u0236\u0223\3\2\2\2\u0236\u022c\3\2\2\2\u0236"+
		"\u022d\3\2\2\2\u0237u\3\2\2\2\u0238\u0239\7B\2\2\u0239\u023e\5~@\2\u023a"+
		"\u023b\7\5\2\2\u023b\u023d\5~@\2\u023c\u023a\3\2\2\2\u023d\u0240\3\2\2"+
		"\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0248\3\2\2\2\u0240\u023e"+
		"\3\2\2\2\u0241\u0243\7\17\2\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2"+
		"\u0243\u0244\3\2\2\2\u0244\u0246\5\u00a8U\2\u0245\u0247\5p9\2\u0246\u0245"+
		"\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248\u0242\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249w\3\2\2\2\u024a\u024b\5\u00a8U\2\u024b\u024c\7\n\2"+
		"\2\u024c\u024e\3\2\2\2\u024d\u024a\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f"+
		"\3\2\2\2\u024f\u0250\5\u00a8U\2\u0250y\3\2\2\2\u0251\u0259\5~@\2\u0252"+
		"\u0254\7\17\2\2\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0257\3"+
		"\2\2\2\u0255\u0258\5\u00a8U\2\u0256\u0258\5p9\2\u0257\u0255\3\2\2\2\u0257"+
		"\u0256\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u0253\3\2\2\2\u0259\u025a\3\2"+
		"\2\2\u025a{\3\2\2\2\u025b\u0260\5z>\2\u025c\u025d\7\5\2\2\u025d\u025f"+
		"\5z>\2\u025e\u025c\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261}\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264\5\u0080"+
		"A\2\u0264\177\3\2\2\2\u0265\u0266\bA\1\2\u0266\u0267\7 \2\2\u0267\u026a"+
		"\5\u0080A\6\u0268\u026a\5\u0082B\2\u0269\u0265\3\2\2\2\u0269\u0268\3\2"+
		"\2\2\u026a\u0273\3\2\2\2\u026b\u026c\f\4\2\2\u026c\u026d\7\36\2\2\u026d"+
		"\u0272\5\u0080A\5\u026e\u026f\f\3\2\2\u026f\u0270\7\35\2\2\u0270\u0272"+
		"\5\u0080A\4\u0271\u026b\3\2\2\2\u0271\u026e\3\2\2\2\u0272\u0275\3\2\2"+
		"\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0081\3\2\2\2\u0275\u0273"+
		"\3\2\2\2\u0276\u0278\5\u0086D\2\u0277\u0279\5\u0084C\2\u0278\u0277\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\u0083\3\2\2\2\u027a\u027c\7 \2\2\u027b"+
		"\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\7#"+
		"\2\2\u027e\u027f\5\u0086D\2\u027f\u0280\7\36\2\2\u0280\u0281\5\u0086D"+
		"\2\u0281\u02a4\3\2\2\2\u0282\u0284\7 \2\2\u0283\u0282\3\2\2\2\u0283\u0284"+
		"\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\7\37\2\2\u0286\u0287\7\3\2\2"+
		"\u0287\u028c\5~@\2\u0288\u0289\7\5\2\2\u0289\u028b\5~@\2\u028a\u0288\3"+
		"\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u028f\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0290\7\4\2\2\u0290\u02a4\3\2"+
		"\2\2\u0291\u0293\7 \2\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u0295\7\37\2\2\u0295\u0296\7\3\2\2\u0296\u0297\5"+
		"L\'\2\u0297\u0298\7\4\2\2\u0298\u02a4\3\2\2\2\u0299\u029b\7 \2\2\u029a"+
		"\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\t\t"+
		"\2\2\u029d\u02a4\5\u0086D\2\u029e\u02a0\7&\2\2\u029f\u02a1\7 \2\2\u02a0"+
		"\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\7\'"+
		"\2\2\u02a3\u027b\3\2\2\2\u02a3\u0283\3\2\2\2\u02a3\u0292\3\2\2\2\u02a3"+
		"\u029a\3\2\2\2\u02a3\u029e\3\2\2\2\u02a4\u0085\3\2\2\2\u02a5\u02a6\bD"+
		"\1\2\u02a6\u02a7\t\n\2\2\u02a7\u02aa\5\u0086D\t\u02a8\u02aa\5\u0088E\2"+
		"\u02a9\u02a5\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aa\u02c0\3\2\2\2\u02ab\u02ac"+
		"\f\b\2\2\u02ac\u02ad\t\13\2\2\u02ad\u02bf\5\u0086D\t\u02ae\u02af\f\7\2"+
		"\2\u02af\u02b0\t\f\2\2\u02b0\u02bf\5\u0086D\b\u02b1\u02b2\f\6\2\2\u02b2"+
		"\u02b3\7\u0089\2\2\u02b3\u02bf\5\u0086D\7\u02b4\u02b5\f\5\2\2\u02b5\u02b6"+
		"\7\u008b\2\2\u02b6\u02bf\5\u0086D\6\u02b7\u02b8\f\4\2\2\u02b8\u02b9\7"+
		"\u008a\2\2\u02b9\u02bf\5\u0086D\5\u02ba\u02bb\f\3\2\2\u02bb\u02bc\5\u008c"+
		"G\2\u02bc\u02bd\5\u0086D\4\u02bd\u02bf\3\2\2\2\u02be\u02ab\3\2\2\2\u02be"+
		"\u02ae\3\2\2\2\u02be\u02b1\3\2\2\2\u02be\u02b4\3\2\2\2\u02be\u02b7\3\2"+
		"\2\2\u02be\u02ba\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u0087\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\bE"+
		"\1\2\u02c4\u0322\t\r\2\2\u02c5\u02c7\7\60\2\2\u02c6\u02c8\5\u00a4S\2\u02c7"+
		"\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2"+
		"\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02cc\7\63\2\2\u02cc\u02ce\5~@\2\u02cd"+
		"\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\7\64"+
		"\2\2\u02d0\u0322\3\2\2\2\u02d1\u02d2\7\60\2\2\u02d2\u02d4\5~@\2\u02d3"+
		"\u02d5\5\u00a4S\2\u02d4\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d4"+
		"\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d9\7\63\2\2"+
		"\u02d9\u02db\5~@\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc"+
		"\3\2\2\2\u02dc\u02dd\7\64\2\2\u02dd\u0322\3\2\2\2\u02de\u02df\7L\2\2\u02df"+
		"\u02e0\7\3\2\2\u02e0\u02e1\5~@\2\u02e1\u02e2\7\17\2\2\u02e2\u02e3\5\u009a"+
		"N\2\u02e3\u02e4\7\4\2\2\u02e4\u0322\3\2\2\2\u02e5\u02e6\7?\2\2\u02e6\u02e7"+
		"\7\3\2\2\u02e7\u02ea\5~@\2\u02e8\u02e9\7c\2\2\u02e9\u02eb\7*\2\2\u02ea"+
		"\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\7\4"+
		"\2\2\u02ed\u0322\3\2\2\2\u02ee\u02ef\7A\2\2\u02ef\u02f0\7\3\2\2\u02f0"+
		"\u02f3\5~@\2\u02f1\u02f2\7c\2\2\u02f2\u02f4\7*\2\2\u02f3\u02f1\3\2\2\2"+
		"\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\7\4\2\2\u02f6\u0322"+
		"\3\2\2\2\u02f7\u0322\5\u008aF\2\u02f8\u0322\7\u0084\2\2\u02f9\u02fa\5"+
		"\u00a6T\2\u02fa\u02fb\7\n\2\2\u02fb\u02fc\7\u0084\2\2\u02fc\u0322\3\2"+
		"\2\2\u02fd\u02fe\7\3\2\2\u02fe\u0301\5z>\2\u02ff\u0300\7\5\2\2\u0300\u0302"+
		"\5z>\2\u0301\u02ff\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0301\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306\7\4\2\2\u0306\u0322\3\2"+
		"\2\2\u0307\u0308\7\3\2\2\u0308\u0309\5L\'\2\u0309\u030a\7\4\2\2\u030a"+
		"\u0322\3\2\2\2\u030b\u030c\5\u00a6T\2\u030c\u0318\7\3\2\2\u030d\u030f"+
		"\5f\64\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0315\5z>\2\u0311\u0312\7\5\2\2\u0312\u0314\5z>\2\u0313\u0311\3\2\2\2"+
		"\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0319"+
		"\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u030e\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u031b\7\4\2\2\u031b\u0322\3\2\2\2\u031c\u0322\5\u00a8"+
		"U\2\u031d\u031e\7\3\2\2\u031e\u031f\5~@\2\u031f\u0320\7\4\2\2\u0320\u0322"+
		"\3\2\2\2\u0321\u02c3\3\2\2\2\u0321\u02c5\3\2\2\2\u0321\u02d1\3\2\2\2\u0321"+
		"\u02de\3\2\2\2\u0321\u02e5\3\2\2\2\u0321\u02ee\3\2\2\2\u0321\u02f7\3\2"+
		"\2\2\u0321\u02f8\3\2\2\2\u0321\u02f9\3\2\2\2\u0321\u02fd\3\2\2\2\u0321"+
		"\u0307\3\2\2\2\u0321\u030b\3\2\2\2\u0321\u031c\3\2\2\2\u0321\u031d\3\2"+
		"\2\2\u0322\u032d\3\2\2\2\u0323\u0324\f\6\2\2\u0324\u0325\7\7\2\2\u0325"+
		"\u0326\5\u0086D\2\u0326\u0327\7\b\2\2\u0327\u032c\3\2\2\2\u0328\u0329"+
		"\f\4\2\2\u0329\u032a\7\n\2\2\u032a\u032c\5\u00a8U\2\u032b\u0323\3\2\2"+
		"\2\u032b\u0328\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e"+
		"\3\2\2\2\u032e\u0089\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u033d\7\'\2\2\u0331"+
		"\u033d\5\u0094K\2\u0332\u0333\5\u00a8U\2\u0333\u0334\7\u00a1\2\2\u0334"+
		"\u033d\3\2\2\2\u0335\u033d\5\u00aeX\2\u0336\u033d\5\u0092J\2\u0337\u0339"+
		"\7\u00a1\2\2\u0338\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u0338\3\2\2"+
		"\2\u033a\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u0330\3\2\2\2\u033c\u0331"+
		"\3\2\2\2\u033c\u0332\3\2\2\2\u033c\u0335\3\2\2\2\u033c\u0336\3\2\2\2\u033c"+
		"\u0338\3\2\2\2\u033d\u008b\3\2\2\2\u033e\u033f\t\16\2\2\u033f\u008d\3"+
		"\2\2\2\u0340\u0341\t\17\2\2\u0341\u008f\3\2\2\2\u0342\u0343\t\20\2\2\u0343"+
		"\u0091\3\2\2\2\u0344\u0345\t\21\2\2\u0345\u0093\3\2\2\2\u0346\u034a\7"+
		"/\2\2\u0347\u0349\5\u0096L\2\u0348\u0347\3\2\2\2\u0349\u034c\3\2\2\2\u034a"+
		"\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u0095\3\2\2\2\u034c\u034a\3\2"+
		"\2\2\u034d\u034e\5\u0098M\2\u034e\u0351\5\u00a8U\2\u034f\u0350\7X\2\2"+
		"\u0350\u0352\5\u00a8U\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"\u0097\3\2\2\2\u0353\u0355\t\f\2\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2"+
		"\2\2\u0355\u0356\3\2\2\2\u0356\u0359\t\22\2\2\u0357\u0359\7\u00a1\2\2"+
		"\u0358\u0354\3\2\2\2\u0358\u0357\3\2\2\2\u0359\u0099\3\2\2\2\u035a\u035b"+
		"\7[\2\2\u035b\u035c\7~\2\2\u035c\u035d\5\u009aN\2\u035d\u035e\7\u0080"+
		"\2\2\u035e\u037d\3\2\2\2\u035f\u0360\7\\\2\2\u0360\u0361\7~\2\2\u0361"+
		"\u0362\5\u009aN\2\u0362\u0363\7\5\2\2\u0363\u0364\5\u009aN\2\u0364\u0365"+
		"\7\u0080\2\2\u0365\u037d\3\2\2\2\u0366\u036d\7]\2\2\u0367\u0369\7~\2\2"+
		"\u0368\u036a\5\u00a0Q\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036b\u036e\7\u0080\2\2\u036c\u036e\7|\2\2\u036d\u0367"+
		"\3\2\2\2\u036d\u036c\3\2\2\2\u036e\u037d\3\2\2\2\u036f\u037a\5\u00a8U"+
		"\2\u0370\u0371\7\3\2\2\u0371\u0376\7\u00a6\2\2\u0372\u0373\7\5\2\2\u0373"+
		"\u0375\7\u00a6\2\2\u0374\u0372\3\2\2\2\u0375\u0378\3\2\2\2\u0376\u0374"+
		"\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0379\3\2\2\2\u0378\u0376\3\2\2\2\u0379"+
		"\u037b\7\4\2\2\u037a\u0370\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037d\3\2"+
		"\2\2\u037c\u035a\3\2\2\2\u037c\u035f\3\2\2\2\u037c\u0366\3\2\2\2\u037c"+
		"\u036f\3\2\2\2\u037d\u009b\3\2\2\2\u037e\u0383\5\u009eP\2\u037f\u0380"+
		"\7\5\2\2\u0380\u0382\5\u009eP\2\u0381\u037f\3\2\2\2\u0382\u0385\3\2\2"+
		"\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u009d\3\2\2\2\u0385\u0383"+
		"\3\2\2\2\u0386\u0387\5\u00a8U\2\u0387\u038a\5\u009aN\2\u0388\u0389\7^"+
		"\2\2\u0389\u038b\7\u00a1\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u009f\3\2\2\2\u038c\u0391\5\u00a2R\2\u038d\u038e\7\5\2\2\u038e\u0390"+
		"\5\u00a2R\2\u038f\u038d\3\2\2\2\u0390\u0393\3\2\2\2\u0391\u038f\3\2\2"+
		"\2\u0391\u0392\3\2\2\2\u0392\u00a1\3\2\2\2\u0393\u0391\3\2\2\2\u0394\u0395"+
		"\5\u00a8U\2\u0395\u0396\7\13\2\2\u0396\u0399\5\u009aN\2\u0397\u0398\7"+
		"^\2\2\u0398\u039a\7\u00a1\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2"+
		"\u039a\u00a3\3\2\2\2\u039b\u039c\7\61\2\2\u039c\u039d\5~@\2\u039d\u039e"+
		"\7\62\2\2\u039e\u039f\5~@\2\u039f\u00a5\3\2\2\2\u03a0\u03a5\5\u00a8U\2"+
		"\u03a1\u03a2\7\n\2\2\u03a2\u03a4\5\u00a8U\2\u03a3\u03a1\3\2\2\2\u03a4"+
		"\u03a7\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u00a7\3\2"+
		"\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03b7\5\u00aaV\2\u03a9\u03b7\7<\2\2\u03aa"+
		"\u03b7\78\2\2\u03ab\u03b7\79\2\2\u03ac\u03b7\7:\2\2\u03ad\u03b7\7;\2\2"+
		"\u03ae\u03b7\7=\2\2\u03af\u03b7\7\65\2\2\u03b0\u03b7\7\66\2\2\u03b1\u03b7"+
		"\7>\2\2\u03b2\u03b7\7T\2\2\u03b3\u03b7\7W\2\2\u03b4\u03b7\7U\2\2\u03b5"+
		"\u03b7\7V\2\2\u03b6\u03a8\3\2\2\2\u03b6\u03a9\3\2\2\2\u03b6\u03aa\3\2"+
		"\2\2\u03b6\u03ab\3\2\2\2\u03b6\u03ac\3\2\2\2\u03b6\u03ad\3\2\2\2\u03b6"+
		"\u03ae\3\2\2\2\u03b6\u03af\3\2\2\2\u03b6\u03b0\3\2\2\2\u03b6\u03b1\3\2"+
		"\2\2\u03b6\u03b2\3\2\2\2\u03b6\u03b3\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6"+
		"\u03b5\3\2\2\2\u03b7\u00a9\3\2\2\2\u03b8\u03bc\7\u00aa\2\2\u03b9\u03bc"+
		"\5\u00acW\2\u03ba\u03bc\5\u00b0Y\2\u03bb\u03b8\3\2\2\2\u03bb\u03b9\3\2"+
		"\2\2\u03bb\u03ba\3\2\2\2\u03bc\u00ab\3\2\2\2\u03bd\u03be\7\u00ab\2\2\u03be"+
		"\u00ad\3\2\2\2\u03bf\u03c1\7\u0083\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1"+
		"\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03dc\7\u00a7\2\2\u03c3\u03c5\7\u0083"+
		"\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6"+
		"\u03dc\7\u00a6\2\2\u03c7\u03c9\7\u0083\2\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9"+
		"\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03dc\7\u00a2\2\2\u03cb\u03cd\7\u0083"+
		"\2\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce"+
		"\u03dc\7\u00a3\2\2\u03cf\u03d1\7\u0083\2\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1"+
		"\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03dc\7\u00a4\2\2\u03d3\u03d5\7\u0083"+
		"\2\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6"+
		"\u03dc\7\u00a8\2\2\u03d7\u03d9\7\u0083\2\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9"+
		"\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dc\7\u00a9\2\2\u03db\u03c0\3\2\2"+
		"\2\u03db\u03c4\3\2\2\2\u03db\u03c8\3\2\2\2\u03db\u03cc\3\2\2\2\u03db\u03d0"+
		"\3\2\2\2\u03db\u03d4\3\2\2\2\u03db\u03d8\3\2\2\2\u03dc\u00af\3\2\2\2\u03dd"+
		"\u03de\t\23\2\2\u03de\u00b1\3\2\2\2v\u00be\u00c7\u00d7\u00e0\u00e3\u00e6"+
		"\u00ee\u00f1\u00f4\u00fd\u0104\u0107\u010e\u0114\u0128\u0147\u014c\u0150"+
		"\u0157\u015b\u0169\u016e\u0177\u017a\u017f\u0193\u0196\u019f\u01ab\u01b0"+
		"\u01b8\u01bc\u01c0\u01c5\u01c8\u01cb\u01cf\u01df\u01e9\u01f2\u01f9\u01fc"+
		"\u0201\u0205\u0209\u020b\u0219\u021e\u0221\u0227\u022a\u0231\u0234\u0236"+
		"\u023e\u0242\u0246\u0248\u024d\u0253\u0257\u0259\u0260\u0269\u0271\u0273"+
		"\u0278\u027b\u0283\u028c\u0292\u029a\u02a0\u02a3\u02a9\u02be\u02c0\u02c9"+
		"\u02cd\u02d6\u02da\u02ea\u02f3\u0303\u030e\u0315\u0318\u0321\u032b\u032d"+
		"\u033a\u033c\u034a\u0351\u0354\u0358\u0369\u036d\u0376\u037a\u037c\u0383"+
		"\u038a\u0391\u0399\u03a5\u03b6\u03bb\u03c0\u03c4\u03c8\u03cc\u03d0\u03d4"+
		"\u03d8\u03db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}