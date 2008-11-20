// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.python.antlr.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

public abstract class stmtType extends PythonTree {

    private final static String[] attributes = new String[] {"lineno",
                                                              "col_offset"};
    public String[] get_attributes() { return attributes; }

    public stmtType() {
    }

    public stmtType(int ttype, Token token) {
        super(ttype, token);
    }

    public stmtType(Token token) {
        super(token);
    }

    public stmtType(PythonTree node) {
        super(node);
    }

}
