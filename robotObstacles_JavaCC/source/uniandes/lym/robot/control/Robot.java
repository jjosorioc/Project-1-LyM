/* Generated By:JavaCC: Do not edit this line. Robot.java */
package uniandes.lym.robot.control;

import uniandes.lym.robot.kernel.*;
import java.awt.Point;
import java.io.*;
import java.util.Vector;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("serial")
public class Robot implements RobotConstants {
        ArrayList<String > varDefinidas = new ArrayList(); // Variables definidas

        private RobotWorldDec world;


        void setWorld(RobotWorld w) {
                world = (RobotWorldDec) w;
        }

        String salida=new String();

// RP de movimientos
  final public void move() throws ParseException {
    jj_consume_token(MOVE);
    jj_consume_token(24);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO:
      jj_consume_token(NUMERO);
      break;
    case ID:
      jj_consume_token(ID);
  if(!(varDefinidas.contains(token.image)))// Check if token.image is in the Array
  {
          // System.out.println("\""+ token.image + "\"" + " is not defined!"); // Luego toca lanzar un error.
          {if (true) throw new Error("\u005c""+ token.image + "\u005c"" + " is not defined!");}
        }
      break;
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void right() throws ParseException {
    jj_consume_token(RIGHT);
    jj_consume_token(24);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO:
      jj_consume_token(NUMERO);
      break;
    case ID:
      jj_consume_token(ID);
  if(!(varDefinidas.contains(token.image)))// Check if token.image is in the Array
  {
          // System.out.println("\""+ token.image + "\"" + " is not defined!"); // Luego toca lanzar un error.
          {if (true) throw new Error("\u005c""+ token.image + "\u005c"" + " is not defined!");}
        }
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void left() throws ParseException {
    jj_consume_token(LEFT);
    jj_consume_token(24);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO:
      jj_consume_token(NUMERO);
      break;
    case ID:
      jj_consume_token(ID);
  if(!(varDefinidas.contains(token.image)))// Check if token.image is in the Array
  {
          // System.out.println("\""+ token.image + "\"" + " is not defined!"); // Luego toca lanzar un error.
          {if (true) throw new Error("\u005c""+ token.image + "\u005c"" + " is not defined!");}
        }
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void rotate() throws ParseException {
    jj_consume_token(ROTATE);
    jj_consume_token(24);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO:
      jj_consume_token(NUMERO);
      break;
    case ID:
      jj_consume_token(ID);
  if(!(varDefinidas.contains(token.image)))// Check if token.image is in the Array
  {
          // System.out.println("\""+ token.image + "\"" + " is not defined!"); // Luego toca lanzar un error.
          {if (true) throw new Error("\u005c""+ token.image + "\u005c"" + " is not defined!");}
        }
      break;
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void look() throws ParseException {
        ArrayList<String> charValidos = new ArrayList<String>(Arrays.asList("N", "S", "E", "W"));
    jj_consume_token(LOOK);
    jj_consume_token(24);
    jj_consume_token(ID);
        if (!(charValidos.contains(token.image))) // Check if CHAR is in charValidos
        {
                {if (true) throw new Error("\u005c""+ token.image + "\u005c"" + " should be either \u005c"N\u005c", \u005c"S\u005c", \u005c"E\u005c", \u005c"W\u005c"!");}
        }
  }

  final public void drop() throws ParseException {
    jj_consume_token(DROP);
    jj_consume_token(24);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO:
      jj_consume_token(NUMERO);
      break;
    case ID:
      jj_consume_token(ID);
  if(!(varDefinidas.contains(token.image)))// Check if token.image is in the Array
  {
          // System.out.println("\""+ token.image + "\"" + " is not defined!"); // Luego toca lanzar un error.
          {if (true) throw new Error("\u005c""+ token.image + "\u005c"" + " is not defined!");}
        }
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void free() throws ParseException {
    jj_consume_token(FREE);
    jj_consume_token(24);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO:
      jj_consume_token(NUMERO);
      break;
    case ID:
      jj_consume_token(ID);
  if(!(varDefinidas.contains(token.image)))// Check if token.image is in the Array
  {
          // System.out.println("\""+ token.image + "\"" + " is not defined!"); // Luego toca lanzar un error.
          {if (true) throw new Error("\u005c""+ token.image + "\u005c"" + " is not defined!");}
        }
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void pick() throws ParseException {
    jj_consume_token(PICK);
    jj_consume_token(24);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO:
      jj_consume_token(NUMERO);
      break;
    case ID:
      jj_consume_token(ID);
  if(!(varDefinidas.contains(token.image)))// Check if token.image is in the Array
  {
          // System.out.println("\""+ token.image + "\"" + " is not defined!"); // Luego toca lanzar un error.
          {if (true) throw new Error("\u005c""+ token.image + "\u005c"" + " is not defined!");}
        }
      break;
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void pop() throws ParseException {
    jj_consume_token(POP);
    jj_consume_token(24);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO:
      jj_consume_token(NUMERO);
      break;
    case ID:
      jj_consume_token(ID);
  if(!(varDefinidas.contains(token.image)))// Check if token.image is in the Array
  {
          // System.out.println("\""+ token.image + "\"" + " is not defined!"); // Luego toca lanzar un error.
          {if (true) throw new Error("\u005c""+ token.image + "\u005c"" + " is not defined!");}
        }
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void check() throws ParseException {
        ArrayList<String> charValidos = new ArrayList<String>(Arrays.asList("C", "B"));
    jj_consume_token(CHECK);
    jj_consume_token(24);
    jj_consume_token(ID);
                if(!(charValidos.contains(token.image)))
                {
                        {if (true) throw new Error("\u005c""+ token.image + "\u005c"" + " should be \u005c"C\u005c" or \u005c"B\u005c"!");}
                }
    jj_consume_token(24);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO:
      jj_consume_token(NUMERO);
      break;
    case ID:
      jj_consume_token(ID);
  if(!(varDefinidas.contains(token.image)))// Check if token.image is in the Array
  {
          // System.out.println("\""+ token.image + "\"" + " is not defined!"); // Luego toca lanzar un error.
          {if (true) throw new Error("\u005c""+ token.image + "\u005c"" + " is not defined!");}
        }
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

// BLOCKEDP


// NOP
  final public void block() throws ParseException {
    jj_consume_token(25);
    jj_consume_token(BLOCK);
    jj_consume_token(26);
  }

// Coso raro que es como el start symbol
  final public boolean command(StringBuffer sistema) throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MOVE:
    case LOOK:
    case CHECK:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MOVE:
        move();
        break;
      case LOOK:
        look();
        break;
      case CHECK:
        check();
         {if (true) return true;}
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    case 0:
      jj_consume_token(0);
          {if (true) return false;}
      break;
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public RobotTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[11];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x900000,0x900000,0x900000,0x900000,0x900000,0x900000,0x900000,0x900000,0x900000,0x1088,0x1089,};
   }

  /** Constructor with InputStream. */
  public Robot(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Robot(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new RobotTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Robot(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new RobotTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Robot(RobotTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(RobotTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[27];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 11; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 27; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
