import axios from 'axios';
import React, { useEffect, useState } from 'react';
import { IEmployee } from '../../../models/IEmployee';
import { EmployeeTable } from './employee-table-presentation-component';

interface IProps{
}
// the component, if it is a functional component, will
//  be of type React.FC and the generics take in the
//  type of props the component will take in.
export const EmployeeDisplay: React.FC<IProps> = (props:IProps) => {

    const [employees, setEmployees] = useState<IEmployee[]>([/* {id:0, name:'',salary:0} */]);

    useEffect(()=>{
        axios
        .get("http://localhost:8082/EmployeeService/employees")
        .then((response)=>{
            console.log(response);
            setEmployees(response.data);
        })
        .catch((err)=>{
            console.error(err);
        })
    },[]);

    // return some structure (list/table) with the data we get back
    return <EmployeeTable employeeRecords={employees}></EmployeeTable> ;

}