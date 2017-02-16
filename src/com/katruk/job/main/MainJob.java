package com.katruk.job.main;

import com.katruk.job.Job;

public class MainJob implements Job {

  private final Job standardJob;
  private final String company;

  public MainJob(Job job, String company) {
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