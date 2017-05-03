(ns flashcards.core)

(def c-syntax-flashcards-stack
  [{:subject "%" :definition "modulus"}
   {:subject "? :" :definition "logical ternary"}
   {:subject "&" :definition "bitwise and"}
   {:subject "|" :definition "bitwise or"}
   {:subject "^" :definition "bitwise xor"}
   {:subject "~" :definition "bitwise ones compliment"}
   {:subject "<<" :definition "bitwise shift left"}
   {:subject ">>" :definition "bitwise shift right"}
   {:subject "*=" :definition "assign multiple-equal"}
   {:subject "sizeof()" :definition "get the size of"}
   {:subject "[]" :definition "Array subscript"}
   {:subject "&x" :definition "the address of x"}
   {:subject "*x" :definition "the value of x"}
   {:subject "->" :definition "structure dereference"}
   {:subject "." :definition "structure reference"}
   {:subject ":" :definition "colon"}
   {:subject "auto"
    :definition "give local variable a local lifettime (this is default)"}
   {:subject "case expr : code; break; default : code; "
    :definition "case statement (used inside switch block)"}
   {:subject "const" :definition "make a variable unmodifiable"}
   {:subject "continue" :definition "continues to the top of a loop"}
   {:subject "do while block" :definition "do { code; } while(expr)"}
   {:subject "double" :definition "double floating point data type"}
   {:subject "enum"
    :definition "define a set of int constants, enum week { mon tue.. }"}
   {:subject "extern" :definition "define an identifier is declared externally"}
   {:subject "goto" :definition "POINT:do { code; goto POINT; }"}
   {:subject "register"
    :definition "declare a variable be stored in the CPU register"}
   {:subject "signed" :definition "int is signed (- to +)"}
   {:subject "static" :definition "preserve variable value after scope exits"}
   {:subject "struct" :definition "combine variables into a single record"}
   {:subject "switch" :definition "switch (var) { case statements; }"}
   {:subject "union" :definition "like struct but weird... look up definition"}
   {:subject "unsigned" :definition "unsigned modifier for int types"}
   {:subject "volatile"
    :definition "declare a variable might be modified elsewhere"}
   {:subject "while" :definition "while(expr) { code; }"}
   {:subject "for" :definition "for(int i = 0; i < 5; i++) { code; }"}
   {:subject "struct syntax" :definition "struct NAME { int x; char y; } [VAR_NAME]"}
   {:subject "typedef struct syntax"
    :definition "typedef struct STRUCT_NAME { int x; char y; } IDENTIFIER"}
   {:subject "typedef" :definition "for(int i = 0; i < 5; i++) { code; }"}
   ])

(def spanish-flashcards-stack
  [{:spanish "¿Cómo está usted?"
    :english "How are you?"
    :pronunciation "KOH-moh ehs-TA oos-TEHD"}
   {:spanish "Mucho gusto."
    :english "Nice to meet you."
    :pronunciation "MOO-choh GOOS-toh"}
   {:spanish "Por favor, habla mas despacio."
    :english "Would you speak slower, please."
    :pronunciation "pohr fah-VOR, AH-blah mahs dehs-PAHS-ee-oh"}])
