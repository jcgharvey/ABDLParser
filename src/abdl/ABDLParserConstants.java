/* Generated By:JavaCC: Do not edit this line. ABDLParserConstants.java */
package abdl;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ABDLParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int ADDRESSBOOK = 5;
  /** RegularExpression Id. */
  int PERSON = 6;
  /** RegularExpression Id. */
  int BIRTHDATE = 7;
  /** RegularExpression Id. */
  int PHONE = 8;
  /** RegularExpression Id. */
  int EMAIL = 9;
  /** RegularExpression Id. */
  int ADDRESS = 10;
  /** RegularExpression Id. */
  int ADDRESS_CONTENT = 11;
  /** RegularExpression Id. */
  int ADDRESSBOOK_NAME = 12;
  /** RegularExpression Id. */
  int PERSON_NAME = 13;
  /** RegularExpression Id. */
  int MONTH = 14;
  /** RegularExpression Id. */
  int DAY = 15;
  /** RegularExpression Id. */
  int YEAR = 16;
  /** RegularExpression Id. */
  int PHONE_CONTENT = 17;
  /** RegularExpression Id. */
  int EXTENSION = 18;
  /** RegularExpression Id. */
  int PLUS = 19;
  /** RegularExpression Id. */
  int EMAIL_CONTENT = 20;
  /** RegularExpression Id. */
  int TYPE = 21;
  /** RegularExpression Id. */
  int MOBILE = 22;
  /** RegularExpression Id. */
  int HOME = 23;
  /** RegularExpression Id. */
  int WORK = 24;
  /** RegularExpression Id. */
  int OTHER = 25;
  /** RegularExpression Id. */
  int ALPHA = 26;
  /** RegularExpression Id. */
  int DIGIT = 27;
  /** RegularExpression Id. */
  int LP = 28;
  /** RegularExpression Id. */
  int RP = 29;
  /** RegularExpression Id. */
  int LCP = 30;
  /** RegularExpression Id. */
  int RCP = 31;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_ADDRESSBOOK = 1;
  /** Lexical state. */
  int IN_PERSON = 2;
  /** Lexical state. */
  int IN_BIRTHDATE = 3;
  /** Lexical state. */
  int IN_ADDRESS = 4;
  /** Lexical state. */
  int IN_EMAIL = 5;
  /** Lexical state. */
  int IN_PHONE = 6;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "\"addressbook\"",
    "\"person\"",
    "\"birthdate\"",
    "\"phone\"",
    "\"email\"",
    "\"address\"",
    "<ADDRESS_CONTENT>",
    "<ADDRESSBOOK_NAME>",
    "<PERSON_NAME>",
    "<MONTH>",
    "<DAY>",
    "<YEAR>",
    "<PHONE_CONTENT>",
    "\"ext\"",
    "\"+\"",
    "<EMAIL_CONTENT>",
    "<TYPE>",
    "\"mobile\"",
    "\"home\"",
    "\"work\"",
    "\"other\"",
    "<ALPHA>",
    "<DIGIT>",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
  };

}
