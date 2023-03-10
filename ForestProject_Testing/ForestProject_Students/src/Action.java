/**
 * An action that can be taken by an entity
 */
public interface Action {
    void executeAction(EventScheduler scheduler);
}
//    private final ActionKind kind;
//    private final Entity entity;
//    private final WorldModel world;
//    private final ImageStore imageStore;
//    private final int repeatCount;
//
//    public Action(
//            ActionKind kind,
//            Entity entity,
//            WorldModel world,
//            ImageStore imageStore,
//            int repeatCount)
//    {
//        this.kind = kind;
//        this.entity = entity;
//        this.world = world;
//        this.imageStore = imageStore;
//        this.repeatCount = repeatCount;
//    }
//
//    public void executeActivityAction(EventScheduler scheduler)
//    {
//        switch (this.entity.getKind()) {
//            case SAPLING:
//                entity.executeSaplingActivity(this.world,
//                        this.imageStore, scheduler);
//                break;
//
//            case TREE:
//                entity.executeTreeActivity(this.world,
//                        this.imageStore, scheduler);
//                break;
//
//            case FAIRY:
//                entity.executeFairyActivity(this.world,
//                        this.imageStore, scheduler);
//                break;
//
//            case DUDE_NOT_FULL:
//                entity.executeDudeNotFullActivity(this.world,
//                        this.imageStore, scheduler);
//                break;
//
//            case DUDE_FULL:
//                entity.executeDudeFullActivity(this.world,
//                        this.imageStore, scheduler);
//                break;
//
//            default:
//                throw new UnsupportedOperationException(String.format(
//                        "executeActivityAction not supported for %s",
//                        this.entity.getKind()));
//        }
//    }
//
//    public void executeAnimationAction(EventScheduler scheduler)
//    {
//        this.entity.nextImage();
//
//        if (this.repeatCount != 1) {
//            scheduler.scheduleEvent(this.entity,
//                    Action.createAnimationAction(this.entity,
//                            Math.max(this.repeatCount - 1,
//                                    0)),
//                    this.entity.getAnimationPeriod());
//        }
//    }
//
//    public void executeAction(EventScheduler scheduler) {
//        switch (this.kind) {
//            case ACTIVITY:
//                executeActivityAction(scheduler);
//                break;
//
//            case ANIMATION:
//                executeAnimationAction(scheduler);
//                break;
//        }
//    }
//
//    public static Action createAnimationAction(Entity entity, int repeatCount) {
//        return new Action(ActionKind.ANIMATION, entity, null, null,
//                repeatCount);
//    }
//
//    public static Action createActivityAction(
//            Entity entity, WorldModel world, ImageStore imageStore)
//    {
//        return new Action(ActionKind.ACTIVITY, entity, world, imageStore, 0);
//    }
//
//
//    public Entity getEntity() {
//        return entity;
//    }
//
//
//}
