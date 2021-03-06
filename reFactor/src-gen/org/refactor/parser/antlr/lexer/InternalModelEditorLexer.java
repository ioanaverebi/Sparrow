package org.refactor.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModelEditorLexer extends Lexer {
    public static final int RULE_END=28;
    public static final int Import=11;
    public static final int RULE_BEGIN=27;
    public static final int Constant=7;
    public static final int Access=10;
    public static final int RULE_STRING=31;
    public static final int RULE_SL_COMMENT=33;
    public static final int Comma=24;
    public static final int Implements=4;
    public static final int LeftParenthesis=22;
    public static final int Accesses=6;
    public static final int Private=9;
    public static final int To=21;
    public static final int Colon=26;
    public static final int Extends=8;
    public static final int EOF=-1;
    public static final int Call=17;
    public static final int FullStop=25;
    public static final int Protected=5;
    public static final int RULE_ID=29;
    public static final int RULE_WS=34;
    public static final int Calls=13;
    public static final int RightParenthesis=23;
    public static final int Public=12;
    public static final int RULE_ANY_OTHER=35;
    public static final int Code=18;
    public static final int RULE_INT=30;
    public static final int FullStopAsterisk=19;
    public static final int Of=20;
    public static final int Cyclo=15;
    public static final int RULE_ML_COMMENT=32;
    public static final int Class=14;
    public static final int Lines=16;

    // delegates
    // delegators

    public InternalModelEditorLexer() {;} 
    public InternalModelEditorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalModelEditorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalModelEditorLexer.g"; }

    // $ANTLR start "Implements"
    public final void mImplements() throws RecognitionException {
        try {
            int _type = Implements;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:14:12: ( 'implements' )
            // InternalModelEditorLexer.g:14:14: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Implements"

    // $ANTLR start "Protected"
    public final void mProtected() throws RecognitionException {
        try {
            int _type = Protected;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:16:11: ( 'protected' )
            // InternalModelEditorLexer.g:16:13: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Protected"

    // $ANTLR start "Accesses"
    public final void mAccesses() throws RecognitionException {
        try {
            int _type = Accesses;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:18:10: ( 'accesses' )
            // InternalModelEditorLexer.g:18:12: 'accesses'
            {
            match("accesses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Accesses"

    // $ANTLR start "Constant"
    public final void mConstant() throws RecognitionException {
        try {
            int _type = Constant;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:20:10: ( 'constant' )
            // InternalModelEditorLexer.g:20:12: 'constant'
            {
            match("constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Constant"

    // $ANTLR start "Extends"
    public final void mExtends() throws RecognitionException {
        try {
            int _type = Extends;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:22:9: ( 'extends' )
            // InternalModelEditorLexer.g:22:11: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Extends"

    // $ANTLR start "Private"
    public final void mPrivate() throws RecognitionException {
        try {
            int _type = Private;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:24:9: ( 'private' )
            // InternalModelEditorLexer.g:24:11: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Private"

    // $ANTLR start "Access"
    public final void mAccess() throws RecognitionException {
        try {
            int _type = Access;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:26:8: ( 'access' )
            // InternalModelEditorLexer.g:26:10: 'access'
            {
            match("access"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Access"

    // $ANTLR start "Import"
    public final void mImport() throws RecognitionException {
        try {
            int _type = Import;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:28:8: ( 'import' )
            // InternalModelEditorLexer.g:28:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Import"

    // $ANTLR start "Public"
    public final void mPublic() throws RecognitionException {
        try {
            int _type = Public;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:30:8: ( 'public' )
            // InternalModelEditorLexer.g:30:10: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Public"

    // $ANTLR start "Calls"
    public final void mCalls() throws RecognitionException {
        try {
            int _type = Calls;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:32:7: ( 'calls' )
            // InternalModelEditorLexer.g:32:9: 'calls'
            {
            match("calls"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Calls"

    // $ANTLR start "Class"
    public final void mClass() throws RecognitionException {
        try {
            int _type = Class;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:34:7: ( 'class' )
            // InternalModelEditorLexer.g:34:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Class"

    // $ANTLR start "Cyclo"
    public final void mCyclo() throws RecognitionException {
        try {
            int _type = Cyclo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:36:7: ( 'cyclo' )
            // InternalModelEditorLexer.g:36:9: 'cyclo'
            {
            match("cyclo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cyclo"

    // $ANTLR start "Lines"
    public final void mLines() throws RecognitionException {
        try {
            int _type = Lines;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:38:7: ( 'lines' )
            // InternalModelEditorLexer.g:38:9: 'lines'
            {
            match("lines"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Lines"

    // $ANTLR start "Call"
    public final void mCall() throws RecognitionException {
        try {
            int _type = Call;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:40:6: ( 'call' )
            // InternalModelEditorLexer.g:40:8: 'call'
            {
            match("call"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Call"

    // $ANTLR start "Code"
    public final void mCode() throws RecognitionException {
        try {
            int _type = Code;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:42:6: ( 'code' )
            // InternalModelEditorLexer.g:42:8: 'code'
            {
            match("code"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Code"

    // $ANTLR start "FullStopAsterisk"
    public final void mFullStopAsterisk() throws RecognitionException {
        try {
            int _type = FullStopAsterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:44:18: ( '.*' )
            // InternalModelEditorLexer.g:44:20: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopAsterisk"

    // $ANTLR start "Of"
    public final void mOf() throws RecognitionException {
        try {
            int _type = Of;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:46:4: ( 'of' )
            // InternalModelEditorLexer.g:46:6: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Of"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:48:4: ( 'to' )
            // InternalModelEditorLexer.g:48:6: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:50:17: ( '(' )
            // InternalModelEditorLexer.g:50:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:52:18: ( ')' )
            // InternalModelEditorLexer.g:52:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:54:7: ( ',' )
            // InternalModelEditorLexer.g:54:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:56:10: ( '.' )
            // InternalModelEditorLexer.g:56:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:58:7: ( ':' )
            // InternalModelEditorLexer.g:58:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalModelEditorLexer.g:62:21: ()
            // InternalModelEditorLexer.g:62:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalModelEditorLexer.g:64:19: ()
            // InternalModelEditorLexer.g:64:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:66:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalModelEditorLexer.g:66:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalModelEditorLexer.g:66:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalModelEditorLexer.g:66:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalModelEditorLexer.g:66:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalModelEditorLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:68:10: ( ( '0' .. '9' )+ )
            // InternalModelEditorLexer.g:68:12: ( '0' .. '9' )+
            {
            // InternalModelEditorLexer.g:68:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalModelEditorLexer.g:68:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:70:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalModelEditorLexer.g:70:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalModelEditorLexer.g:70:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalModelEditorLexer.g:70:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalModelEditorLexer.g:70:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalModelEditorLexer.g:70:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalModelEditorLexer.g:70:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalModelEditorLexer.g:70:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalModelEditorLexer.g:70:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalModelEditorLexer.g:70:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalModelEditorLexer.g:70:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:72:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalModelEditorLexer.g:72:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalModelEditorLexer.g:72:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalModelEditorLexer.g:72:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:74:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalModelEditorLexer.g:74:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalModelEditorLexer.g:74:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalModelEditorLexer.g:74:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalModelEditorLexer.g:74:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalModelEditorLexer.g:74:41: ( '\\r' )? '\\n'
                    {
                    // InternalModelEditorLexer.g:74:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalModelEditorLexer.g:74:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:76:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalModelEditorLexer.g:76:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalModelEditorLexer.g:76:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalModelEditorLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalModelEditorLexer.g:78:16: ( . )
            // InternalModelEditorLexer.g:78:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalModelEditorLexer.g:1:8: ( Implements | Protected | Accesses | Constant | Extends | Private | Access | Import | Public | Calls | Class | Cyclo | Lines | Call | Code | FullStopAsterisk | Of | To | LeftParenthesis | RightParenthesis | Comma | FullStop | Colon | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=30;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalModelEditorLexer.g:1:10: Implements
                {
                mImplements(); 

                }
                break;
            case 2 :
                // InternalModelEditorLexer.g:1:21: Protected
                {
                mProtected(); 

                }
                break;
            case 3 :
                // InternalModelEditorLexer.g:1:31: Accesses
                {
                mAccesses(); 

                }
                break;
            case 4 :
                // InternalModelEditorLexer.g:1:40: Constant
                {
                mConstant(); 

                }
                break;
            case 5 :
                // InternalModelEditorLexer.g:1:49: Extends
                {
                mExtends(); 

                }
                break;
            case 6 :
                // InternalModelEditorLexer.g:1:57: Private
                {
                mPrivate(); 

                }
                break;
            case 7 :
                // InternalModelEditorLexer.g:1:65: Access
                {
                mAccess(); 

                }
                break;
            case 8 :
                // InternalModelEditorLexer.g:1:72: Import
                {
                mImport(); 

                }
                break;
            case 9 :
                // InternalModelEditorLexer.g:1:79: Public
                {
                mPublic(); 

                }
                break;
            case 10 :
                // InternalModelEditorLexer.g:1:86: Calls
                {
                mCalls(); 

                }
                break;
            case 11 :
                // InternalModelEditorLexer.g:1:92: Class
                {
                mClass(); 

                }
                break;
            case 12 :
                // InternalModelEditorLexer.g:1:98: Cyclo
                {
                mCyclo(); 

                }
                break;
            case 13 :
                // InternalModelEditorLexer.g:1:104: Lines
                {
                mLines(); 

                }
                break;
            case 14 :
                // InternalModelEditorLexer.g:1:110: Call
                {
                mCall(); 

                }
                break;
            case 15 :
                // InternalModelEditorLexer.g:1:115: Code
                {
                mCode(); 

                }
                break;
            case 16 :
                // InternalModelEditorLexer.g:1:120: FullStopAsterisk
                {
                mFullStopAsterisk(); 

                }
                break;
            case 17 :
                // InternalModelEditorLexer.g:1:137: Of
                {
                mOf(); 

                }
                break;
            case 18 :
                // InternalModelEditorLexer.g:1:140: To
                {
                mTo(); 

                }
                break;
            case 19 :
                // InternalModelEditorLexer.g:1:143: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 20 :
                // InternalModelEditorLexer.g:1:159: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 21 :
                // InternalModelEditorLexer.g:1:176: Comma
                {
                mComma(); 

                }
                break;
            case 22 :
                // InternalModelEditorLexer.g:1:182: FullStop
                {
                mFullStop(); 

                }
                break;
            case 23 :
                // InternalModelEditorLexer.g:1:191: Colon
                {
                mColon(); 

                }
                break;
            case 24 :
                // InternalModelEditorLexer.g:1:197: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // InternalModelEditorLexer.g:1:205: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // InternalModelEditorLexer.g:1:214: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // InternalModelEditorLexer.g:1:226: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // InternalModelEditorLexer.g:1:242: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // InternalModelEditorLexer.g:1:258: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // InternalModelEditorLexer.g:1:266: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\6\27\1\42\2\27\4\uffff\1\25\2\uffff\3\25\2\uffff\1\27\1\uffff\11\27\2\uffff\1\72\1\73\11\uffff\14\27\2\uffff\7\27\1\120\1\122\13\27\1\uffff\1\136\1\uffff\1\137\1\140\1\27\1\142\1\27\1\144\2\27\1\147\1\151\1\27\3\uffff\1\27\1\uffff\1\27\1\uffff\1\27\1\156\1\uffff\1\27\1\uffff\1\27\1\161\2\27\1\uffff\1\164\1\165\1\uffff\1\27\1\167\2\uffff\1\170\2\uffff";
    static final String DFA12_eofS =
        "\171\uffff";
    static final String DFA12_minS =
        "\1\0\1\155\1\162\1\143\1\141\1\170\1\151\1\52\1\146\1\157\4\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\160\1\uffff\1\151\1\142\1\143\1\144\1\154\1\141\1\143\1\164\1\156\2\uffff\2\60\11\uffff\1\154\1\164\1\166\1\154\1\145\1\163\1\145\1\154\1\163\1\154\2\145\2\uffff\1\145\1\162\1\145\1\141\1\151\1\163\1\164\2\60\1\163\1\157\1\156\1\163\1\155\1\164\1\143\1\164\1\143\1\163\1\141\1\uffff\1\60\1\uffff\2\60\1\144\1\60\1\145\1\60\1\164\1\145\2\60\1\156\3\uffff\1\163\1\uffff\1\156\1\uffff\1\145\1\60\1\uffff\1\163\1\uffff\1\164\1\60\1\164\1\144\1\uffff\2\60\1\uffff\1\163\1\60\2\uffff\1\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\155\1\165\1\143\1\171\1\170\1\151\1\52\1\146\1\157\4\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\160\1\uffff\1\157\1\142\1\143\1\156\1\154\1\141\1\143\1\164\1\156\2\uffff\2\172\11\uffff\1\157\1\164\1\166\1\154\1\145\1\163\1\145\1\154\1\163\1\154\2\145\2\uffff\1\145\1\162\1\145\1\141\1\151\1\163\1\164\2\172\1\163\1\157\1\156\1\163\1\155\1\164\1\143\1\164\1\143\1\163\1\141\1\uffff\1\172\1\uffff\2\172\1\144\1\172\1\145\1\172\1\164\1\145\2\172\1\156\3\uffff\1\163\1\uffff\1\156\1\uffff\1\145\1\172\1\uffff\1\163\1\uffff\1\164\1\172\1\164\1\144\1\uffff\2\172\1\uffff\1\163\1\172\2\uffff\1\172\2\uffff";
    static final String DFA12_acceptS =
        "\12\uffff\1\23\1\24\1\25\1\27\1\uffff\1\30\1\31\3\uffff\1\35\1\36\1\uffff\1\30\11\uffff\1\20\1\26\2\uffff\1\23\1\24\1\25\1\27\1\31\1\32\1\33\1\34\1\35\14\uffff\1\21\1\22\24\uffff\1\17\1\uffff\1\16\13\uffff\1\12\1\13\1\14\1\uffff\1\15\1\uffff\1\10\2\uffff\1\11\1\uffff\1\7\4\uffff\1\6\2\uffff\1\5\2\uffff\1\3\1\4\1\uffff\1\2\1\1";
    static final String DFA12_specialS =
        "\1\2\20\uffff\1\0\1\1\146\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\4\25\1\22\1\12\1\13\2\25\1\14\1\25\1\7\1\23\12\20\1\15\6\25\32\17\3\25\1\16\1\17\1\25\1\3\1\17\1\4\1\17\1\5\3\17\1\1\2\17\1\6\2\17\1\10\1\2\3\17\1\11\6\17\uff85\25",
            "\1\26",
            "\1\30\2\uffff\1\31",
            "\1\32",
            "\1\34\12\uffff\1\35\2\uffff\1\33\11\uffff\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\43",
            "\1\44",
            "",
            "",
            "",
            "",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\0\52",
            "\0\52",
            "\1\53\4\uffff\1\54",
            "",
            "",
            "\1\56",
            "",
            "\1\60\5\uffff\1\57",
            "\1\61",
            "\1\62",
            "\1\64\11\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\2\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\121\7\27",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\141",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\143",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\145",
            "\1\146",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\150\25\27",
            "\1\152",
            "",
            "",
            "",
            "\1\153",
            "",
            "\1\154",
            "",
            "\1\155",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\157",
            "",
            "\1\160",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\162",
            "\1\163",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\166",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Implements | Protected | Accesses | Constant | Extends | Private | Access | Import | Public | Calls | Class | Cyclo | Lines | Call | Code | FullStopAsterisk | Of | To | LeftParenthesis | RightParenthesis | Comma | FullStop | Colon | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( ((LA12_17>='\u0000' && LA12_17<='\uFFFF')) ) {s = 42;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 42;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='i') ) {s = 1;}

                        else if ( (LA12_0=='p') ) {s = 2;}

                        else if ( (LA12_0=='a') ) {s = 3;}

                        else if ( (LA12_0=='c') ) {s = 4;}

                        else if ( (LA12_0=='e') ) {s = 5;}

                        else if ( (LA12_0=='l') ) {s = 6;}

                        else if ( (LA12_0=='.') ) {s = 7;}

                        else if ( (LA12_0=='o') ) {s = 8;}

                        else if ( (LA12_0=='t') ) {s = 9;}

                        else if ( (LA12_0=='(') ) {s = 10;}

                        else if ( (LA12_0==')') ) {s = 11;}

                        else if ( (LA12_0==',') ) {s = 12;}

                        else if ( (LA12_0==':') ) {s = 13;}

                        else if ( (LA12_0=='^') ) {s = 14;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='d'||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='m' && LA12_0<='n')||(LA12_0>='q' && LA12_0<='s')||(LA12_0>='u' && LA12_0<='z')) ) {s = 15;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 16;}

                        else if ( (LA12_0=='\"') ) {s = 17;}

                        else if ( (LA12_0=='\'') ) {s = 18;}

                        else if ( (LA12_0=='/') ) {s = 19;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 20;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='-'||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}