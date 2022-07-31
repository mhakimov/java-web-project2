package com.customer;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FeatureAUtilsTest extends TestCase {

    public void testTransformToLower() {
        String text = FeatureAUtils.transformToLower("TEXT");
        Assert.assertEquals("text", text);
    }

    public void testTransformToLowerNumbers() {
        String text = FeatureAUtils.transformToLower("1234321");
        Assert.assertEquals("1234321", text);
    }
}