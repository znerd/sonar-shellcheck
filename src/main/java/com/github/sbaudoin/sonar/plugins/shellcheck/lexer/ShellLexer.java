package com.github.sbaudoin.sonar.plugins.shellcheck.lexer;

import java.util.List;

/**
 * Shell lexers should implement this interface
 */
public interface ShellLexer {
    /**
     * This is the only method a Shell lexer need to implement. It should return non-overlapping
     * tokens for each recognized token in the stream set by the constructor.
     *
     * @return the list of Tokens found in the script
     */
    List<Token> parse();
}