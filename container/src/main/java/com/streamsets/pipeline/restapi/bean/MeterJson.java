/**
 * (c) 2015 StreamSets, Inc. All rights reserved. May not
 * be copied, modified, or distributed in whole or part without
 * written consent of StreamSets, Inc.
 */
package com.streamsets.pipeline.restapi.bean;

public class MeterJson {
  private long count;
  private long m1_rate;
  private long m5_rate;
  private long m15_rate;
  private long m30_rate;
  private long h1_rate;
  private long h6_rate;
  private long h12_rate;
  private long h24_rate;
  private long mean_rate;
  private String units;

  public MeterJson() {

  }

  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

  public long getM1_rate() {
    return m1_rate;
  }

  public void setM1_rate(long m1_rate) {
    this.m1_rate = m1_rate;
  }

  public long getM5_rate() {
    return m5_rate;
  }

  public void setM5_rate(long m5_rate) {
    this.m5_rate = m5_rate;
  }

  public long getM15_rate() {
    return m15_rate;
  }

  public void setM15_rate(long m15_rate) {
    this.m15_rate = m15_rate;
  }

  public long getM30_rate() {
    return m30_rate;
  }

  public void setM30_rate(long m30_rate) {
    this.m30_rate = m30_rate;
  }

  public long getH1_rate() {
    return h1_rate;
  }

  public void setH1_rate(long h1_rate) {
    this.h1_rate = h1_rate;
  }

  public long getH6_rate() {
    return h6_rate;
  }

  public void setH6_rate(long h6_rate) {
    this.h6_rate = h6_rate;
  }

  public long getH12_rate() {
    return h12_rate;
  }

  public void setH12_rate(long h12_rate) {
    this.h12_rate = h12_rate;
  }

  public long getH24_rate() {
    return h24_rate;
  }

  public void setH24_rate(long h24_rate) {
    this.h24_rate = h24_rate;
  }

  public long getMean_rate() {
    return mean_rate;
  }

  public void setMean_rate(long mean_rate) {
    this.mean_rate = mean_rate;
  }

  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }
}
