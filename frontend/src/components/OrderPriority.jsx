import {Typography, Button, Table , Space} from "antd";


const tableColumns = [
    {
        title: "S.NO",
        key: "sno",
        render : (_value, _record , index) => index + 1
    },
    {
        title: "Job Name",
        dataIndex : "jobName",
        key: "jobName"
    },
    {
        title: "Category",
        dataIndex : "category",
        key: "category"
    },
    {
        title: "Readiness",
        dataIndex : "status",
        key: "status"
    },
    {
        title: "Due Date",
        dataIndex : "dueDate",
        key: "dueDate"
    }
]

function OrderPriority () {
    return (
        <div style={{maxWidth: "1100", margin : "0 auto", padding: "20px"}}>
            <Space orientation="vertical" size="large" style={{width: "100%"}} >
                <div style={{justifyContent: "space-between", alignItems : "center"}}>
                    <Typography.Title>Order Priority</Typography.Title>
                    <Typography type="secondary">View all the materials, change the availability</Typography>
                </div>

                <Table rowKey="id" columns={tableColumns} locale={"No materials found"}
                 pagination= {5}></Table>
            </Space>
        </div>
    )
}

export default OrderPriority;