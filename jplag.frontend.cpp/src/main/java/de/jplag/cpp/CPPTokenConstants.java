package de.jplag.cpp;

import de.jplag.TokenConstants;

public interface CPPTokenConstants extends TokenConstants {
  final static int FILE_END = 0;
  // Used to optionally separate methods from each other
  // with an always marked token
  final static int SEPARATOR_TOKEN = 1;

  final static int C_BLOCK_BEGIN = 2;
  final static int C_BLOCK_END = 3;
  final static int C_SCOPE = 4;
  final static int C_QUESTIONMARK = 5;
  final static int C_ELLIPSIS = 6;
  final static int C_ASSIGN = 7;
  final static int C_DOT = 8;
  final static int C_ARROW = 9;
  final static int C_ARROWSTAR = 10;
  final static int C_AUTO = 11;
  final static int C_BREAK = 12;
  final static int C_CASE = 13;
  final static int C_CATCH = 14;
  final static int C_CHAR = 15;
  final static int C_CONST = 16;
  final static int C_CONTINUE = 17;
  final static int C_DEFAULT = 18;
  final static int C_DELETE = 19;
  final static int C_DO = 20;
  final static int C_DOUBLE = 21;
  final static int C_ELSE = 22;
  final static int C_ENUM = 23;
  final static int C_EXTERN = 24;
  final static int C_FLOAT = 25;
  final static int C_FOR = 26;
  final static int C_FRIEND = 27;
  final static int C_GOTO = 28;
  final static int C_IF = 29;
  final static int C_INLINE = 30;
  final static int C_INT = 31;
  final static int C_LONG = 32;
  final static int C_NEW = 33;
  final static int C_PRIVATE = 34;
  final static int C_PROTECTED = 35;
  final static int C_PUBLIC = 36;
  final static int C_REDECLARED = 37;
  final static int C_REGISTER = 38;
  final static int C_RETURN = 39;
  final static int C_SHORT = 40;
  final static int C_SIGNED = 41;
  final static int C_SIZEOF = 42;
  final static int C_STATIC = 43;
  final static int C_STRUCT = 44;
  final static int C_CLASS = 45;
  final static int C_SWITCH = 46;
  final static int C_TEMPLATE = 47;
  final static int C_THIS = 48;
  final static int C_TRY = 49;
  final static int C_TYPEDEF = 50;
  final static int C_UNION = 51;
  final static int C_UNSIGNED = 52;
  final static int C_VIRTUAL = 53;
  final static int C_VOID = 54;
  final static int C_VOLANTILE = 55;
  final static int C_WHILE = 56;
  final static int C_OPERATOR = 57;
  final static int C_THROW = 58;
  final static int C_ID = 59;
  final static int C_FUN = 60;
  final static int C_DOTSTAR = 61;
  final static int C_NULL = 62;

  final static int NUM_DIFF_TOKENS = 63;
}
