package com.fiberhome.apple;
/**
 * @Description:
 * @author zsj
 * @date 2017年3月9日 下午8:03:40
 */
public class AppleGreenColorPredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		return "green".equals(apple.getColor());
	}

}
