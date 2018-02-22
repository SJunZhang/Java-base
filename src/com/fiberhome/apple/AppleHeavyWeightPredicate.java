package com.fiberhome.apple;
/**
 * @Description:
 * @author zsj
 * @date 2017年3月9日 下午8:02:24
 */
public class AppleHeavyWeightPredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 10d;
	}
	

}
