
import {Typography, Button, Table , Space} from "antd";


const dataSource = [
  {
    materialName : "Wood",
    unitPrice : "500",
    availableStock : "50",
  },
  {
    
  },
];


const tableColumns = [
    {
        title: "S.NO",
        key: "sno",
        render : (_value, _record , index) => index + 1
    },
    {
        title: "Material Name",
        dataIndex : "materialName",
        key: "materialName"
    },
    {
        title: "Unit Price",
        dataIndex : "unitPrice",
        key: "unitPrice"
    },
    {
        title: "Available Stock",
        dataIndex : "availableStock",
        key: "availableStock"
    },
    {
        title: "Decrement",
        dataIndex: "decrement",
        key: "decrement",
        render : (_,record) => (
            <Button type="primary" danger>-</Button>
        )

    },
    {
        title: "Incremenet",
        dataIndex: "increment",
        key: "increment",
        render : (_,record) => (
            <Button type="primary">+</Button>
        )

    }

]

function Materials () {
    return (
        <div style={{maxWidth: "1100", margin : "0 auto", padding: "20px"}}>
            <Space orientation="vertical" size="large" style={{width: "100%"}} >
                <div style={{justifyContent: "space-between", alignItems : "center"}}>
                    <Typography.Title>Material Details</Typography.Title>
                    <Typography type="secondary">View all the materials, change the availability</Typography>
                </div>

                <Table rowKey="id" columns={tableColumns} locale={"No materials found"}
                dataSource = {dataSource} pagination= {5}></Table>
            </Space>
        </div>
    )
}

export default Materials;