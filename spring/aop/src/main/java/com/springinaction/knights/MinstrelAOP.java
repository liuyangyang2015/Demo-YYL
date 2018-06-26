package com.springinaction.knights;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class MinstrelAOP {

	@DeclareParents(value="com.springinaction.knights.Knight+",defaultImpl=DefaultKnightAOP.class)
	public static KnightAOP knightAOP;
}
