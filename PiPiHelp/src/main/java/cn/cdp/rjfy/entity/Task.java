package cn.cdp.rjfy.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task {
    private long id;
    private String taskname;
    private Double taskmoney;
    private Integer tasktype;
    private Integer tasknumber;
    private Integer taskstatus;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "taskname")
    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    @Basic
    @Column(name = "taskmoney")
    public Double getTaskmoney() {
        return taskmoney;
    }

    public void setTaskmoney(Double taskmoney) {
        this.taskmoney = taskmoney;
    }

    @Basic
    @Column(name = "tasktype")
    public Integer getTasktype() {
        return tasktype;
    }

    public void setTasktype(Integer tasktype) {
        this.tasktype = tasktype;
    }

    @Basic
    @Column(name = "tasknumber")
    public Integer getTasknumber() {
        return tasknumber;
    }

    public void setTasknumber(Integer tasknumber) {
        this.tasknumber = tasknumber;
    }

    @Basic
    @Column(name = "taskstatus")
    public Integer getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(Integer taskstatus) {
        this.taskstatus = taskstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (id != task.id) return false;
        if (taskname != null ? !taskname.equals(task.taskname) : task.taskname != null) return false;
        if (taskmoney != null ? !taskmoney.equals(task.taskmoney) : task.taskmoney != null) return false;
        if (tasktype != null ? !tasktype.equals(task.tasktype) : task.tasktype != null) return false;
        if (tasknumber != null ? !tasknumber.equals(task.tasknumber) : task.tasknumber != null) return false;
        if (taskstatus != null ? !taskstatus.equals(task.taskstatus) : task.taskstatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (taskname != null ? taskname.hashCode() : 0);
        result = 31 * result + (taskmoney != null ? taskmoney.hashCode() : 0);
        result = 31 * result + (tasktype != null ? tasktype.hashCode() : 0);
        result = 31 * result + (tasknumber != null ? tasknumber.hashCode() : 0);
        result = 31 * result + (taskstatus != null ? taskstatus.hashCode() : 0);
        return result;
    }
}
