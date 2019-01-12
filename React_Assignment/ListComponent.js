import React,{Component} from 'react';
class ListComponent extends Component{
    
    render(){
        console.log(this.props.employees)
        
        return(
        <div>
            <h1>Employees</h1>
            <table border="1" cellpading="1">
            {
                this.props.employee &&
                this.props.employee.map((employee,i)=>{
                   return( <tr key={employee.name}>
                        <td>
                            {employee.name}
                        </td>
                        <td>
                            {employee.lname}
                        </td>
                        <td>
                            {employee.age}
                        </td>
                        <td>
                            {employee.Department}
                        </td>
                        <td>
                            {employee.designation}
                        </td>
                        <td>
                            {employee.location}
                        </td>
                    </tr>
                    )
                })
            }
            </table>
            
        </div>
        )
    }
}
export default ListComponent;