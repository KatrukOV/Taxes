package com.katruk.job.primary;

import com.katruk.job.Job;

public class PrimaryJob implements Job {

  private final Job standardJob;
  private final String company;

  public PrimaryJob(Job job, String company) {
    this.standardJob = job;
    this.company = company;
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