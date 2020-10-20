// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/main/java/gt/url/compis/proyectofas1/flex/lexico.flex

package gt.url.compis.proyectofas1;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexico {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\12\0\1\1\2\2\1\3\22\0\1\4\1\5\1\6"+
    "\1\0\1\7\1\10\2\0\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\10\1\17\12\20\1\15\1\21\1\10"+
    "\1\22\1\10\2\0\1\23\2\24\1\25\11\24\1\26"+
    "\1\27\1\30\1\24\1\31\13\24\1\32\2\24\1\33"+
    "\1\34\1\35\1\36\1\37\1\24\1\40\1\41\1\42"+
    "\2\24\1\43\1\44\1\45\1\46\1\47\1\24\1\50"+
    "\1\51\1\52\1\53\1\54\1\24\1\55\1\24\1\56"+
    "\1\15\1\10\1\15\7\0\1\2\u01a2\0\2\2\326\0"+
    "\u0100\2";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\1\1\3\1\4\1\5\3\4"+
    "\1\6\1\7\1\4\4\10\1\4\14\10\1\0\1\6"+
    "\1\0\1\11\1\12\24\10\1\13\1\14\2\0\2\11"+
    "\1\12\25\10\1\0\1\11\16\10\1\13\6\10\1\13"+
    "\22\10\1\0\4\10\1\13\10\10\5\0\1\10\1\13"+
    "\2\10\1\0\2\10\6\0\1\10\1\0\2\10\1\0"+
    "\2\10\5\0\1\10\1\0\1\10\14\0\1\15\37\0"+
    "\1\16\13\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[229];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\57\0\136\0\215\0\274\0\57\0\57"+
    "\0\353\0\u011a\0\u0149\0\u0178\0\57\0\136\0\u01a7\0\u01d6"+
    "\0\u0205\0\u0234\0\u01d6\0\u0263\0\u0292\0\u02c1\0\u02f0\0\u031f"+
    "\0\u034e\0\u037d\0\u03ac\0\u03db\0\u040a\0\u0439\0\u0468\0\u0497"+
    "\0\u04c6\0\u04f5\0\u0524\0\u0553\0\u0582\0\u05b1\0\u05e0\0\u060f"+
    "\0\u063e\0\u066d\0\u069c\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787"+
    "\0\u07b6\0\u07e5\0\u0814\0\u0843\0\u0872\0\u08a1\0\u08d0\0\u08ff"+
    "\0\u092e\0\57\0\u095d\0\u098c\0\57\0\u09bb\0\u09ea\0\u0a19"+
    "\0\u0a48\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0b91"+
    "\0\u0bc0\0\u0bef\0\u0c1e\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\u0d09"+
    "\0\u0d38\0\u0d67\0\u0d96\0\u0dc5\0\u0df4\0\u095d\0\u0e23\0\u0e52"+
    "\0\u0e81\0\u0eb0\0\u0edf\0\u0f0e\0\u0f3d\0\u0f6c\0\u0f9b\0\u0fca"+
    "\0\u0ff9\0\u1028\0\u1057\0\u1086\0\u01d6\0\u10b5\0\u10e4\0\u1113"+
    "\0\u1142\0\u1171\0\u11a0\0\u11cf\0\u11fe\0\u122d\0\u125c\0\u128b"+
    "\0\u12ba\0\u12e9\0\u1318\0\u1347\0\u1376\0\u13a5\0\u13d4\0\u1403"+
    "\0\u1432\0\u1461\0\u1490\0\u14bf\0\u14ee\0\u151d\0\u154c\0\u157b"+
    "\0\u15aa\0\u15d9\0\u1608\0\u1637\0\u1666\0\u1695\0\u16c4\0\u16f3"+
    "\0\u1722\0\u1751\0\u1780\0\u17af\0\u17de\0\u180d\0\u183c\0\u186b"+
    "\0\u189a\0\u18c9\0\u18f8\0\u1927\0\u1956\0\u1985\0\u19b4\0\u19e3"+
    "\0\u1a12\0\u1a41\0\u1a70\0\u1a9f\0\u1ace\0\u1afd\0\u1b2c\0\u1b5b"+
    "\0\u1b8a\0\u1bb9\0\u1be8\0\u1c17\0\u1c46\0\u1c75\0\u1ca4\0\u1cd3"+
    "\0\u1d02\0\u1d31\0\u1d60\0\u1d8f\0\u1dbe\0\u1ded\0\u1e1c\0\u1e4b"+
    "\0\u1e7a\0\u1ea9\0\u1ed8\0\u1f07\0\u1f36\0\u1f65\0\u1f94\0\u1fc3"+
    "\0\u1ff2\0\57\0\u2021\0\u2050\0\u207f\0\u20ae\0\u20dd\0\u210c"+
    "\0\u213b\0\u216a\0\u2199\0\u21c8\0\u21f7\0\u2226\0\u2255\0\u2284"+
    "\0\u22b3\0\u22e2\0\u2311\0\u2340\0\u236f\0\u239e\0\u23cd\0\u23fc"+
    "\0\u242b\0\u245a\0\u2489\0\u24b8\0\u24e7\0\u2516\0\u2545\0\u2574"+
    "\0\u25a3\0\57\0\u25d2\0\u2601\0\u2630\0\u265f\0\u268e\0\u26bd"+
    "\0\u26ec\0\u271b\0\u274a\0\u2779\0\u27a8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[229];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\2\1\4\1\5\1\6\1\7\2\10"+
    "\1\7\1\11\1\10\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\3\20\1\21\1\22\1\20\1\23\1\20\1\24"+
    "\1\25\1\26\1\27\1\20\1\30\1\31\1\32\1\33"+
    "\1\34\1\20\1\35\1\36\1\37\5\20\101\0\1\7"+
    "\57\0\34\40\7\0\1\6\63\0\1\7\60\0\1\7"+
    "\1\0\1\41\51\0\1\42\3\0\1\43\57\0\1\14"+
    "\2\0\34\44\20\0\1\45\2\0\3\20\1\46\30\20"+
    "\20\0\1\45\2\0\34\20\20\0\1\45\2\0\6\20"+
    "\1\23\25\20\20\0\1\45\2\0\25\20\1\47\6\20"+
    "\20\0\1\45\2\0\23\20\1\50\10\20\20\0\1\45"+
    "\2\0\10\20\1\51\7\20\1\52\2\20\1\53\10\20"+
    "\20\0\1\45\2\0\14\20\1\54\17\20\20\0\1\45"+
    "\2\0\22\20\1\55\3\20\1\56\3\20\1\57\1\20"+
    "\20\0\1\45\2\0\10\20\1\60\23\20\20\0\1\45"+
    "\2\0\22\20\1\61\11\20\20\0\1\45\2\0\14\20"+
    "\1\62\17\20\20\0\1\45\2\0\14\20\1\63\2\20"+
    "\1\64\14\20\20\0\1\45\2\0\30\20\1\65\3\20"+
    "\20\0\1\45\2\0\25\20\1\66\2\20\1\67\3\20"+
    "\20\0\1\45\2\0\14\20\1\70\17\20\20\0\1\45"+
    "\2\0\17\20\1\71\14\20\6\0\1\72\14\0\34\40"+
    "\20\0\1\41\36\0\13\73\1\74\43\73\1\43\1\75"+
    "\1\43\1\76\53\43\20\0\1\77\2\0\34\44\20\0"+
    "\1\45\56\0\1\45\2\0\2\20\1\23\31\20\20\0"+
    "\1\45\2\0\17\20\1\100\14\20\20\0\1\45\2\0"+
    "\20\20\1\101\13\20\20\0\1\45\2\0\13\20\1\102"+
    "\20\20\20\0\1\45\2\0\10\20\1\103\23\20\20\0"+
    "\1\45\2\0\22\20\1\104\11\20\20\0\1\45\2\0"+
    "\12\20\1\105\13\20\1\106\2\20\1\107\2\20\20\0"+
    "\1\45\2\0\27\20\1\110\4\20\20\0\1\45\2\0"+
    "\12\20\1\111\21\20\20\0\1\45\2\0\27\20\1\112"+
    "\4\20\20\0\1\45\2\0\12\20\1\62\21\20\20\0"+
    "\1\45\2\0\12\20\1\113\13\20\1\114\5\20\20\0"+
    "\1\45\2\0\14\20\1\115\17\20\20\0\1\45\2\0"+
    "\27\20\1\116\4\20\20\0\1\45\2\0\14\20\1\117"+
    "\17\20\20\0\1\45\2\0\20\20\1\120\13\20\20\0"+
    "\1\45\2\0\17\20\1\121\3\20\1\122\10\20\20\0"+
    "\1\45\2\0\11\20\1\123\22\20\20\0\1\45\2\0"+
    "\10\20\1\124\23\20\20\0\1\45\2\0\22\20\1\120"+
    "\11\20\13\73\1\125\56\73\1\125\3\73\1\126\37\73"+
    "\1\0\1\75\75\0\1\77\56\0\1\45\2\0\22\20"+
    "\1\127\11\20\20\0\1\45\2\0\14\20\1\130\17\20"+
    "\20\0\1\45\2\0\14\20\1\131\17\20\20\0\1\45"+
    "\2\0\26\20\1\132\5\20\20\0\1\45\2\0\26\20"+
    "\1\133\5\20\20\0\1\45\2\0\25\20\1\134\6\20"+
    "\20\0\1\45\2\0\13\20\1\132\13\20\1\135\4\20"+
    "\20\0\1\45\2\0\23\20\1\136\10\20\20\0\1\45"+
    "\2\0\14\20\1\137\6\20\1\140\10\20\20\0\1\45"+
    "\2\0\25\20\1\141\6\20\20\0\1\45\2\0\17\20"+
    "\1\142\14\20\20\0\1\45\2\0\20\20\1\143\4\20"+
    "\1\134\6\20\20\0\1\45\2\0\27\20\1\144\4\20"+
    "\20\0\1\45\2\0\25\20\1\145\6\20\20\0\1\45"+
    "\2\0\23\20\1\146\10\20\20\0\1\45\2\0\22\20"+
    "\1\147\11\20\20\0\1\45\2\0\23\20\1\145\10\20"+
    "\20\0\1\45\2\0\31\20\1\150\2\20\20\0\1\45"+
    "\2\0\24\20\1\151\2\20\1\152\4\20\20\0\1\45"+
    "\2\0\20\20\1\153\13\20\20\0\1\45\2\0\20\20"+
    "\1\154\13\20\13\73\1\125\3\73\1\75\37\73\20\0"+
    "\1\45\2\0\12\20\1\155\21\20\20\0\1\45\2\0"+
    "\10\20\1\156\23\20\20\0\1\45\2\0\22\20\1\157"+
    "\11\20\20\0\1\45\2\0\14\20\1\145\17\20\20\0"+
    "\1\45\2\0\27\20\1\135\4\20\20\0\1\45\2\0"+
    "\14\20\1\160\17\20\20\0\1\45\2\0\25\20\1\161"+
    "\6\20\20\0\1\45\2\0\20\20\1\162\13\20\20\0"+
    "\1\45\2\0\25\20\1\163\6\20\20\0\1\45\2\0"+
    "\22\20\1\164\11\20\20\0\1\45\2\0\17\20\1\165"+
    "\14\20\20\0\1\45\2\0\14\20\1\166\17\20\20\0"+
    "\1\45\2\0\30\20\1\167\3\20\20\0\1\45\2\0"+
    "\10\20\1\170\23\20\20\0\1\45\2\0\13\20\1\171"+
    "\20\20\20\0\1\45\2\0\27\20\1\172\4\20\20\0"+
    "\1\45\2\0\10\20\1\173\23\20\20\0\1\45\2\0"+
    "\17\20\1\174\14\20\20\0\1\45\2\0\14\20\1\175"+
    "\17\20\20\0\1\45\2\0\17\20\1\176\14\20\4\0"+
    "\1\177\13\0\1\45\2\0\34\20\20\0\1\45\2\0"+
    "\17\20\1\200\14\20\20\0\1\45\2\0\22\20\1\201"+
    "\11\20\20\0\1\45\2\0\10\20\1\145\23\20\20\0"+
    "\1\45\2\0\21\20\1\202\12\20\20\0\1\45\2\0"+
    "\30\20\1\203\3\20\20\0\1\45\2\0\31\20\1\62"+
    "\2\20\20\0\1\45\2\0\23\20\1\204\10\20\20\0"+
    "\1\45\2\0\12\20\1\205\21\20\20\0\1\45\2\0"+
    "\11\20\1\167\22\20\20\0\1\45\2\0\22\20\1\206"+
    "\11\20\20\0\1\45\2\0\17\20\1\115\14\20\20\0"+
    "\1\45\2\0\22\20\1\207\11\20\20\0\1\45\2\0"+
    "\23\20\1\210\10\20\20\0\1\45\2\0\25\20\1\211"+
    "\6\20\20\0\1\45\2\0\13\20\1\212\20\20\20\0"+
    "\1\45\2\0\14\20\1\213\17\20\20\0\1\45\2\0"+
    "\15\20\1\214\16\20\20\0\1\45\2\0\12\20\1\212"+
    "\21\20\35\0\1\215\5\0\1\216\4\0\1\217\1\220"+
    "\1\221\24\0\1\45\2\0\24\20\1\222\7\20\20\0"+
    "\1\45\2\0\23\20\1\223\10\20\20\0\1\45\2\0"+
    "\14\20\1\224\17\20\20\0\1\45\2\0\12\20\1\225"+
    "\21\20\4\0\1\226\13\0\1\45\2\0\34\20\20\0"+
    "\1\45\2\0\14\20\1\210\17\20\20\0\1\45\2\0"+
    "\13\20\1\132\20\20\20\0\1\45\2\0\12\20\1\227"+
    "\21\20\20\0\1\45\2\0\26\20\1\145\5\20\20\0"+
    "\1\45\2\0\10\20\1\210\23\20\20\0\1\45\2\0"+
    "\10\20\1\210\12\20\1\210\10\20\20\0\1\45\2\0"+
    "\13\20\1\230\20\20\20\0\1\45\2\0\17\20\1\173"+
    "\14\20\33\0\1\231\12\0\1\232\56\0\1\233\43\0"+
    "\1\234\62\0\1\235\52\0\1\236\43\0\1\45\2\0"+
    "\10\20\1\237\23\20\4\0\1\240\13\0\1\45\2\0"+
    "\34\20\20\0\1\45\2\0\22\20\1\241\11\20\20\0"+
    "\1\45\2\0\27\20\1\242\4\20\35\0\1\243\41\0"+
    "\1\45\2\0\17\20\1\244\14\20\20\0\1\45\2\0"+
    "\10\20\1\245\23\20\36\0\1\246\71\0\1\220\45\0"+
    "\1\247\60\0\1\250\61\0\1\251\56\0\1\252\31\0"+
    "\1\45\2\0\20\20\1\253\13\20\35\0\1\254\41\0"+
    "\1\45\2\0\27\20\1\244\4\20\20\0\1\45\2\0"+
    "\23\20\1\255\10\20\33\0\1\256\43\0\1\45\2\0"+
    "\10\20\1\115\23\20\20\0\1\45\2\0\13\20\1\205"+
    "\20\20\37\0\1\257\52\0\1\260\101\0\1\261\46\0"+
    "\1\261\50\0\1\262\27\0\1\263\6\0\1\45\2\0"+
    "\34\20\33\0\1\264\43\0\1\45\2\0\25\20\1\253"+
    "\6\20\36\0\1\265\65\0\1\266\61\0\1\267\17\0"+
    "\1\270\104\0\1\271\31\0\1\272\102\0\1\273\57\0"+
    "\1\274\52\0\1\275\65\0\1\276\64\0\1\277\53\0"+
    "\1\300\50\0\1\301\64\0\1\302\34\0\1\303\105\0"+
    "\1\304\43\0\1\305\71\0\1\306\51\0\1\307\44\0"+
    "\1\310\73\0\1\311\52\0\1\251\45\0\1\312\62\0"+
    "\1\261\52\0\1\313\46\0\1\314\72\0\1\315\62\0"+
    "\1\316\36\0\1\317\72\0\1\320\52\0\1\321\27\0"+
    "\1\322\106\0\1\323\67\0\1\324\54\0\1\325\36\0"+
    "\34\326\46\0\1\327\62\0\1\330\15\0\1\331\57\0"+
    "\1\332\5\0\1\333\2\0\34\326\43\0\1\334\52\0"+
    "\1\335\54\0\1\336\33\0\1\332\5\0\1\333\75\0"+
    "\1\337\67\0\1\340\41\0\1\341\56\0\1\342\71\0"+
    "\1\325\46\0\1\343\65\0\1\340\50\0\1\344\64\0"+
    "\1\345\44\0\1\316\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10199];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\2\11\4\1\1\11\22\1\1\0"+
    "\1\1\1\0\27\1\1\11\2\0\1\11\27\1\1\0"+
    "\51\1\1\0\15\1\5\0\4\1\1\0\2\1\6\0"+
    "\1\1\1\0\2\1\1\0\2\1\5\0\1\1\1\0"+
    "\1\1\14\0\1\11\37\0\1\11\13\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[229];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { 
            }
            // fall through
          case 15: break;
          case 2:
            { System.out.print(yytext());
            }
            // fall through
          case 16: break;
          case 3:
            { System.out.println("LEX: ERROR: " + yytext() + " L: " + yyline);
            }
            // fall through
          case 17: break;
          case 4:
            { System.out.println("LEX: Encontre un operador: " + yytext());
            }
            // fall through
          case 18: break;
          case 5:
            { System.out.println("LEX: Encontre un simbolo: " + yytext());
            }
            // fall through
          case 19: break;
          case 6:
            { System.out.println("LEX: Encontre un numero: " + yytext());
            }
            // fall through
          case 20: break;
          case 7:
            { System.out.println("LEX: Encontre un simbolo de final de linea: " + yytext());
            }
            // fall through
          case 21: break;
          case 8:
            { System.out.println("LEX: Encontre un identificador: " + yytext());
            }
            // fall through
          case 22: break;
          case 9:
            { System.out.println("LEX: Encontre un comentario: " + yytext());
            }
            // fall through
          case 23: break;
          case 10:
            { System.out.println("LEX-ERROR: no Ides: " + yytext());
            }
            // fall through
          case 24: break;
          case 11:
            { System.out.println("LEX: Encontre una palabra reservada: " + yytext());
            }
            // fall through
          case 25: break;
          case 12:
            { System.out.println("LEX: Encontre una palabra: " + yytext());
            }
            // fall through
          case 26: break;
          case 13:
            { System.out.println("LEX: Encontre un metodo reservado: " + yytext());
            }
            // fall through
          case 27: break;
          case 14:
            { System.out.println("LEX: Encontre una Fespecial: " + yytext());
            }
            // fall through
          case 28: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexico [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexico scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexico(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
