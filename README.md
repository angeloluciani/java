# java


By setting the schedule period to 15 13 * * * you tell jenkins to schedule the build every day of every month of every year at the 15th minute of the 13th hour of the day.

What Jenkins used is a cron expression, the different fields are :

    MINUTES Minutes in one hour (0-59)
    HOURS Hours in one day (0-23)
    DAYMONTH Day in a month (1-31)
    MONTH Month in a year (1-12)
    DAYWEEK Day of the week (0-7) where 0 and 7 are sunday

If you want to schedule your build every 5 minutes, this will do the job : */5 * * * *

If you want to schedule your build every day at 8h00, this will do the job : 0 8 * * *

Edit from June 2014 : since a few versions, Jenkins add a new parameter, H : (extract from the jenkins code documentation)

    To allow periodically scheduled tasks to produce even load on the system, the symbol H (for “hash”) should be used wherever possible.

    For example, using 0 0 * * * for a dozen daily jobs will cause a large spike at midnight. In contrast, using H H * * * would still execute each job once a day, but not all at the same time, better using limited resources.

Note also that :

    The H symbol can be thought of as a random value over a range, but it actually is a hash of the job name, not a random function, so that the value remains stable for any given project.
