# USE CASE: 3 Produce a report on the salary of employees in my department

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *department manager* I want to *produce a report on the salary of employees in my department* so that I can *support financial reporting for my department.*

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the department manager's department.  Database contains current employee salary data.

### Success End Condition

A report is available for department manager to provide to finance.

### Failed End Condition

No report is produced.

### Primary Actor

Department Manager.

### Trigger

A request for finance information is sent to Department Manager.

## MAIN SUCCESS SCENARIO

1. Finance request salary information for Department manager's department.
2. Department manager captures name of their department to get salary information for.
3. Department manager extracts current salary information of all employees of their department.
4. Department manager provides report to finance.

## EXTENSIONS

3. **Department does not exist**:
    1. Department manager informs finance that department does not exist.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
