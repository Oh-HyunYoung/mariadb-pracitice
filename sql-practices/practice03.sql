-- 테이블간 조인(JOIN)

-- 문제1.
-- 현재 급여가 많은 직원부터 직원의 사번, 이름, 그리고 연봉을 출력 하시오.
select a.emp_no, b.first_name, a.salary
   from salaries a, employees b
 where a.emp_no = b.emp_no
	and a.to_date = '9999-01-01'
order by a.salary desc;


-- 문제2.
-- 전체 사원의 사번, 이름, 현재 직책을 이름 순서로 출력하세요.
select a.emp_no, a.first_name, c.title
	from employees a, departments b , titles c
  where a.emp_no = c.emp_no
   and c.to_date = '9999-01-01'
   group by first_name
  order by a.first_name asc;


-- 문제3.
-- 전체 사원의 사번, 이름, 현재 부서를 이름 순서로 출력하세요.
select a.emp_no, a.first_name, b.dept_name
	from employees a, departments b , dept_emp c
  where a.emp_no = c.emp_no 
   and b.dept_no = c.dept_no
   and c.to_date = '9999-01-01'
   group by first_name
  order by a.first_name asc;

-- 문제4. //////
-- 전체 사원의 사번, 이름, 연봉, 직책, 부서를 모두 이름 순서로 출력합니다.
select a.emp_no, a.first_name, e.salary, c.title, b.dept_name
	from employees a, departments b , titles c, dept_emp d, salaries e
  where a.emp_no = c.emp_no
    and a.emp_no = d.emp_no
	and a.emp_no = e.emp_no
    and b.dept_no = d.dept_no
	and c.to_date = '9999-01-01'
  order by a.first_name asc;


-- 문제5.
-- ‘Technique Leader’의 직책으로 과거에 근무한 적이 있는 모든 사원의 사번과 이름을 출력하세요. 
-- (현재 ‘Technique Leader’의 직책(으로 근무하는사원은 고려하지 않습니다.) 이름은 first_name과 last_name을 합쳐 출력합니다.
select a.emp_no, concat(a.first_name, ' ', a.last_name) as TL
	from employees a, titles b
  where a.emp_no = b.emp_no
     and b.to_date != '9999-01-01'
     and b.title = 'Technique Leader';
     
-- 문제6.
-- 직원 이름(last_name) 중에서 S(대문자)로 시작하는 직원들의 이름, 부서명, 직책을 조회하세요.
select a.first_name, b.dept_name, c.title
   from employees a, departments b, titles c
   where a.emp_no = c.emp_no 
	  and a.first_name like binary 'S%';


-- 문제7.
-- 현재, 직책이 Engineer인 사원 중에서 현재 급여가 40000 이상인 사원을 급여가 큰 순서대로 출력하세요.
select d.salary
  from titles c, salaries d
 where c.emp_no = d.emp_no
    and c.to_date = '9999-01-01'
    and d.to_date = '9999-01-01'
    and c.title = 'Engineer'
    and d.salary >= 40000
 group by d.salary
order by avg(d.salary) desc;


-- 문제8.
-- 현재 평균 급여가 50000이 넘는 직책을 직책, 급여로 급여가 큰 순서대로 출력하시오.
select c.title, avg(d.salary)
  from titles c, salaries d
 where c.emp_no = d.emp_no
    and c.to_date = '9999-01-01'
    and d.to_date = '9999-01-01'
 group by c.title
	having avg(d.salary) >= 50000
 order by avg(d.salary) desc;

-- 문제9.
-- 현재, 부서별 평균 연봉을 연봉이 큰 부서 순서대로 출력하세요.
select a.dept_name, b.salary
	from departments a, salaries b
    where b.to_date = '9999-01-01'
    group by a.dept_name
order by avg(b.salary) desc;

-- 문제10.
-- 현재, 직책별 평균 연봉을 연봉이 큰 직책 순서대로 출력하세요.
select a.title, b.salary
	from titles a, salaries b
    where a.emp_no = b.emp_no
		and b.to_date = '9999-01-01'
    group by a.title
order by avg(b.salary) desc;


show processlist;
kill 18;