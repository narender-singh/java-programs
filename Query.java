public class Query
{
    public static void main(String... args)
    {
        String str = "[BEGIN pint_own.update_run_stats('N','BIGDATA','BD-100','BD-000','pypimco-daily_pma_risk_load','daily_pma_risk_load_eod_2018-03-30_ => \"{'hive_stage_table_name': 'attrib_picaso_stage.picaso_returns',\\n 'hive_table_name_history': 'attrib_picaso.picaso_returns',\\n 'run_id': '20180402_07_34_27PM_596'}\" ',to_date('04/02/2018','MM/dd/yyyy'),99,'ERROR eod cycle copy to bigdata, \nEXCEPTION: \nTRACE:Traceback (most recent call last):\n  File \"/base/apps/pypimco/dev/bigdata/pma_risk_archive/etl_tasks/common.py\", line 348, in wrapper\n    v = f(*args, **kwargs)\n  File \"/base/apps/pypimco/dev/bigdata/pma_risk_archive/script/../../../bigdata/pma_risk_archive/daily_risk_workflow.py\", line 118, in _export_daily_table\n    status =  workflows.ExportDailyTableToBDA(config, context=context).run()\n  File \"/base/apps/pypimco/dev/bigdata/pma_risk_archive/etl_tasks/workflows.py\", line 134, in run\n    t.run()\n  File \"/base/apps/pypimco/dev/bigdata/pma_risk_archive/etl_tasks/table_tasks.py\", line 348, in run\n slf._run()\n  File \"/base/apps/pypimco/dev/bigdata/pma_risk_archive/etl_tasks/table_tasks.py\", line 400, in _run\n    exported_row_count, exported_validation_sum = self.get_validation_exported_count()\n  File \"/base/apps/pypimco/dev/bigdata/pma_risk_archive/etl_tasks/table_tasks.py\", line 481, in get_validation_exported_count\n    hive_db.describe_impala(self.table_config.table_names.stage_name, self.table_config.vendor)\n  File \"/base/apps/pypimco/dev/bigdata/db/hive_db.py\", line <t_co>, in describe_impala\n    with sql_db.SqlDb(impala_conn, 'hive', user=user, log=False) as db:\n  File \"/base/apps/pypimco/dev/core/db/sql_db.py\", line 47, in __init__\n    sql_db_conn._connect(self)\n  File \"/base/apps/pypimco/dev/core/db/sql_db_conn.py\", line 40, in _connect\n    raise ex\nerror: [Errno 104] Connection reset by peer\n','','null','python-client','null',''); END;]";
       str =  str.replaceAll("'","''");
       System.out.println(str);
    }
}