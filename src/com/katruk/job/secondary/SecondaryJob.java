package com.katruk.job.secondary;

import com.katruk.job.Job;

public class SecondaryJob implements Job {

  private final Job standardJob;

  public SecondaryJob(Job job) {
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