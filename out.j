.source out.ir
.class public myclassname
.super java/lang/Object

.method public static __main()V
	.limit locals 13
	.var 0 is T0  I from L_0 to L_1
	.var 1 is T1  C from L_0 to L_1
	.var 2 is T2  Ljava/lang/String; from L_0 to L_1
	.var 3 is T3  I from L_0 to L_1
	.var 4 is T4  I from L_0 to L_1
	.var 5 is T5  Z from L_0 to L_1
	.var 6 is T6  Z from L_0 to L_1
	.var 7 is T7  Ljava/lang/String; from L_0 to L_1
	.var 8 is T8  I from L_0 to L_1
	.var 9 is T9  Z from L_0 to L_1
	.var 10 is T10  Z from L_0 to L_1
	.var 11 is T11  Ljava/lang/String; from L_0 to L_1
	.var 12 is T12  Ljava/lang/String; from L_0 to L_1
	.limit stack 16
L_0:
	ldc 0
	istore 0
	ldc 0
	istore 1
	aconst_null 
	astore 2
	ldc 0
	istore 3
	ldc 0
	istore 4
	ldc 0
	istore 5
	ldc 0
	istore 6
	aconst_null 
	astore 7
	ldc 0
	istore 8
	ldc 0
	istore 9
	ldc 0
	istore 10
	aconst_null 
	astore 11
	aconst_null 
	astore 12
.line 18
;		    T2 := "Hello there!";
	ldc "Hello there!"
	astore 2
.line 19
;		    PRINTU T2;
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 2
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
.line 20
;		    T3 := 1;
	ldc 1
	istore 3
.line 21
;		    T0 := T3;
	iload 3
	istore 0
.line 22
;		    T4 := 1;
	ldc 1
	istore 4
.line 23
;		    T5 := T0 I== T4;
	iload 0
	iload 4
	isub
	ifeq L_2
	ldc 0
	goto L_3
L_2:
	ldc 1
L_3:
	istore 5
.line 24
;		    T6 := T5;
	iload 5
	istore 6
.line 25
;		    T6 := Z!T6;
	iload 6
	ldc 1
	ixor
	istore 6
.line 26
;		    IF T6 GOTO L0;
	iload 6
	ifne L0
.line 27
;		    T7 := "X was 1";
	ldc "X was 1"
	astore 7
.line 28
;		    PRINTLNU T7;
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 7
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
.line 29
;		    GOTO L1;
	goto L1
.line 30
;		    L0:;
L0:
.line 31
;		    L1:;
L1:
.line 32
;		    T8 := 2;
	ldc 2
	istore 8
.line 33
;		    T9 := T0 I== T8;
	iload 0
	iload 8
	isub
	ifeq L_4
	ldc 0
	goto L_5
L_4:
	ldc 1
L_5:
	istore 9
.line 34
;		    T10 := T9;
	iload 9
	istore 10
.line 35
;		    T10 := Z!T10;
	iload 10
	ldc 1
	ixor
	istore 10
.line 36
;		    IF T10 GOTO L2;
	iload 10
	ifne L2
.line 37
;		    T11 := "noope";
	ldc "noope"
	astore 11
.line 38
;		    PRINTLNU T11;
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 11
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
.line 39
;		    GOTO L3;
	goto L3
.line 40
;		    L2:;
L2:
.line 41
;		    T12 := "X WAS 2!!";
	ldc "X WAS 2!!"
	astore 12
.line 42
;		    PRINTLNU T12;
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 12
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
.line 43
;		    L3:;
L3:
	return
L_1:
.end method

;--------------------------------------------;
;                                            ;
; Boilerplate                                ;
;                                            ;
;--------------------------------------------;

.method public static main([Ljava/lang/String;)V
	; set limits used by this method
	.limit locals 1
	.limit stack 4
	invokestatic myclassname/__main()V
	return
.end method

; standard initializer
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method
