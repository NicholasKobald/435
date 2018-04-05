.source baseline.ir
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
