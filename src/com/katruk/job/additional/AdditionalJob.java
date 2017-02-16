package com.katruk.job.additional;

import com.katruk.job.Job;

public class AdditionalJob implements Job {

  private final Job standardJob;

  public AdditionalJob(Job job) {
    this.standardJob = job;
  }

  @Override
  public long salary() {
    return this.standardJob.salary();
  }

  @Override
  public String position() {
    return this.standardJob.position();
  }
}