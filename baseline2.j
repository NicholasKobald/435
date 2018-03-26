.source baseline2.ir
.class public baseline.ul
.super java/lang/Object

.method public static __main()V
	.limit locals 2
	.var 0 is T0  I from L_0 to L_1
	.var 1 is T1  I from L_0 to L_1
	.limit stack 16
L_0:
	ldc 0
	istore 0
	ldc 0
	istore 1
.line 8
;		    T1 := 1;
	ldc 1
	istore 1
.line 9
;		    T0 := T1;
	iload 1
	istore 0
.line 10
;		    RETURN;
	return
L_1:
.end method

.method public static foo(I)I
	.limit locals 4
	.var 0 is T0  I from L_2 to L_3
	.var 1 is T1  I from L_2 to L_3
	.var 2 is T2  I from L_2 to L_3
	.var 3 is T3  I from L_2 to L_3
	.limit stack 16
L_2:
	ldc 0
	istore 1
	ldc 0
	istore 2
	ldc 0
	istore 3
.line 19
;		    T1 := T0;
	iload 0
	istore 1
.line 20
;		    T2 := 1;
	ldc 1
	istore 2
.line 21
;		    T3 := T1 I+ T2;
	iload 1
	iload 2
	iadd
	istore 3
.line 22
;		    T1 := T3;
	iload 3
	istore 1
.line 23
;		    RETURN T1;
	iload 1
	ireturn
.line 24
;		    RETURN;
	return
L_3:
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
	invokestatic baseline.ul/__main()V
	return
.end method

; standard initializer
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method
