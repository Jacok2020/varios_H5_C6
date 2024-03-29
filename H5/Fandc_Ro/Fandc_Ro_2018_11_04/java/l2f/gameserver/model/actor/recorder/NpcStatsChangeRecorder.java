/*	*/ package l2f.gameserver.model.actor.recorder;
/*	*/ 
/*	*/ import l2f.gameserver.model.instances.NpcInstance;
/*	*/ 
/*	*/ public class NpcStatsChangeRecorder extends CharStatsChangeRecorder<NpcInstance>
/*	*/ {
/*	*/   public NpcStatsChangeRecorder(NpcInstance actor)
/*	*/   {
/*  9 */	super(actor);
/*	*/   }
/*	*/ 
/*	*/   protected void onSendChanges()
/*	*/   {
/* 15 */	super.onSendChanges();
/*	*/ 
/* 17 */	if ((this._changes & 0x1) == 1)
/* 18 */	((NpcInstance)this._activeChar).broadcastCharInfo();
/*	*/   }
/*	*/ }