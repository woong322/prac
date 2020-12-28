import React from "react";

const EmployeeTable = (props) =>{
    if(props.employeeRecords && props.employeeRecords.length){
        return <div>
        <table className="table">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Salary</th>
                </tr>
            </thead>
            <tbody>
                {props.employeeRecords.map((employee)=>{
                    return (<tr key={employee.id}>
                        <td>{employee.id}</td>
                        <td>{employee.name}</td>
                        <td>{employee.salary}</td>
                    </tr>)
                })}
            </tbody>
        </table>
    </div>
    } else {
        return <span>No data to show</span>
    } 
}

export default EmployeeTable;
